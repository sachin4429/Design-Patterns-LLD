# Singleton Design Pattern — Complete Revision Sheet

---

## 1. Master Comparison Table

| Pattern | Category | Thread-Safe? | Runtime Speed | Core Mechanism | Major Demerit / Limitation |
| :--- | :---: | :---: | :---: | :--- | :--- |
| **Eager Initialization** | Eager | Yes | Fast | Created when class is loaded by JVM. | Memory wasted if instance is never used. No `try-catch`. |
| **Static Block** | Eager | Yes | Fast | Created in `static { ... }` block at class load. | Still eager (wastes memory if unused). |
| **Lazy Initialization** | Lazy | **No** | Fast | `if (instance == null)` creates instance on demand. | **Race condition:** Multiple threads create duplicate objects. |
| **Method Synchronized** | Lazy | Yes | **Slow** | `synchronized` keyword on `getInstance()` method. | Severe performance drop; locks on *every* single read call. |
| **Double-Checked Locking** | Lazy | Yes | Fast | Checks `null` twice; locks only on the first creation. | Complex; requires `volatile` to prevent CPU reordering. |
| **Bill Pugh (Holder)** | Lazy | Yes | Fast | Static inner helper class holds the instance. | Slightly harder to handle exceptions during creation. |
| **Enum Singleton** | Eager | Yes | Fast | Single-item `enum` managed directly by JVM. | Eagerly loaded; cannot extend another class. |

---

## 2. Quick Code Cheat Sheet

| Pattern | Minimal Code Structure | How It Works Under The Hood |
| :--- | :--- | :--- |
| **Eager** | `private static final Eager instance = new Eager();` | JVM initializes instance at class-loading time. |
| **Static Block** | `static { try { instance = new StaticBlock(); } catch(Exception e){} }` | Allows exception handling during eager creation. |
| **Lazy** | `if (instance == null) instance = new Lazy();` | Delays creation until first call, but unsafe for threads. |
| **Method Synchronized** | `public static synchronized ThreadSafe getInstance()` | Acquires class-level lock on every method invocation. |
| **Double-Checked Locking** | `if (inst == null) { synchronized(Cls.class) { if (inst == null) inst = new DCL(); } }` | Only locks during initial creation; uses `volatile`. |
| **Bill Pugh** | `private static class Helper { static final BillPugh INST = new BillPugh(); }` | JVM loads `Helper` class **only** when `getInstance()` is called. |
| **Enum** | `public enum MySingleton { INSTANCE; }` | JVM guarantees only 1 instance; blocks reflection & serialization duplicates. |

---

## 3. How to Break a Singleton & How to Defend

| Attack Vector | How It Breaks the Singleton | How to Defend (Standard Class) | Protected in Enum? |
| :--- | :--- | :--- | :---: |
| **Reflection Attack** | Uses `Constructor.setAccessible(true)` to call `private` constructor again. | Throw an exception inside the constructor if `instance != null`. | **Yes (100%)**<br>JVM throws `IllegalArgumentException`. |
| **Serialization Attack** | Writing object to disk and reading back creates a **new copy** in heap. | Implement `protected Object readResolve() { return getInstance(); }`. | **Yes (100%)**<br>JVM handles enum deserialization natively. |
| **Cloning Attack** | Calling `clone()` creates a shallow copy of the object. | Override `clone()` and throw `CloneNotSupportedException`. | **Yes (100%)**<br>Enums cannot be cloned. |
| **Multithreading Race** | Multiple threads pass `if (instance == null)` simultaneously. | Use Double-Checked Locking or Bill Pugh Holder. | **Yes (100%)**<br>Loaded safely by JVM. |

---

## 4. Top Interview Questions & Crisp Answers

| Question | Core Concept | To-The-Point Answer |
| :--- | :--- | :--- |
| **Why is `instance` always `static`?** | Memory & Compiler rules | 1. `getInstance()` is static, so it cannot access non-static variables.<br>2. Non-static variables require an object to exist first (circular dependency). `static` binds it to the class as a single global variable. |
| **Why is `volatile` MANDATORY in Double-Checked Locking?** | Instruction Reordering | `new Object()` takes 3 steps: (1) Allocate memory, (2) Run constructor, (3) Point reference to memory.<br>The CPU can reorder this to **1 $\rightarrow$ 3 $\rightarrow$ 2**.<br>Without `volatile`, Thread B can see `instance != null` before the constructor finishes, receiving a **half-initialized object**. `volatile` stops reordering. |
| **Why does Bill Pugh load lazily while Eager does not?** | JVM ClassLoader Rules | In Java, an **inner class is NOT loaded** when the outer class is loaded.<br>`SingletonHelper` stays unloaded until `getInstance()` explicitly references it. |
| **Why is Method-Level `synchronized` bad?** | Lock Contention | Synchronization is only needed once (at creation). Locking every subsequent read call creates an unnecessary 100x performance penalty. |
| **Why did Joshua Bloch call Enum the best Singleton?** | Language Specification | It is the only Singleton pattern that is natively immune to **Reflection attacks**, **Serialization duplicates**, and **Thread safety issues** without writing custom defense code. |

---

## 5. Practical Decision Matrix: Which One to Choose?

| Scenario | Recommended Pattern | Why |
| :--- | :--- | :--- |
| **General / Default Choice** | **Enum Singleton** | Easiest to write, zero boilerplate, 100% immune to Reflection and Serialization attacks. |
| **Heavy Object + Must be Lazy Loaded** | **Bill Pugh Singleton** | True lazy loading, thread-safe, zero synchronization performance penalty. |
| **Need Lazy Loading in Older Java / Custom Hierarchy** | **Double-Checked Locking** | Standard pattern when extending a class is required and lazy creation is needed. |
| **Initialization Requires Exception Handling** | **Static Block Singleton** | Allows `try-catch` blocks to catch and handle configuration or startup failures. |
| **Never use in any real application** | **Classic Lazy Singleton** | Breaks under concurrent thread execution. |
