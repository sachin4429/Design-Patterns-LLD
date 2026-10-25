# Low-Level Design (LLD) & Design Patterns in Java

This repository contains clean, modular, and interview-ready implementations of software design patterns in Java, complete with driver classes and thread-safety tests.

## Contents

### 1. Creational Patterns
- **[Singleton Design Pattern](./SingletonDesignPattern/)**
  - **Eager Initialization:** [EagerSingleton](./SingletonDesignPattern/EagerSingleton/)
  - **Static Block Initialization:** [StaticBlockSingleton](./SingletonDesignPattern/StaticBlockSingleton/)
  - **Classic Lazy Initialization:** [LazySingleton](./SingletonDesignPattern/LazySingleton/)
  - **Method-Level Synchronized:** [ThreadSafeSingleton](./SingletonDesignPattern/ThreadSafeSingleton/)
  - **Double-Checked Locking:** [DoubleCheckSingleton](./SingletonDesignPattern/DoubleCheckSingleton/)
  - **Bill Pugh (Initialization-on-demand Holder):** [BillPughSingleton](./SingletonDesignPattern/BillPughSingleton/)
  - **Enum Singleton:** [EnumSingleton](./SingletonDesignPattern/EnumSingleton/)

- **[Factory Method Design Pattern](./FactoryDesignPattern/)**
  - Notification System: [NotificationSystem](./FactoryDesignPattern/NotificationSystem/)
  - Subscription System: [Subscription](./FactoryDesignPattern/Subscription/)
- **[Abstract Factory Design Pattern](./AbstractFactoryDesignPattern/)**
  - Shoe Factory Family (Sole + ShoeLace): [AbstractFactoryDesignPattern](./AbstractFactoryDesignPattern/)
  - 👉 **[ABSTRACT_FACTORY_REVISION_GUIDE.md](./AbstractFactoryDesignPattern/ABSTRACT_FACTORY_REVISION_GUIDE.md)**

---

## 📖 Quick Revision Guides
- 👉 **[SINGLETON_REVISION_GUIDE.md](./SingletonDesignPattern/SINGLETON_REVISION_GUIDE.md)**
- 👉 **[ABSTRACT_FACTORY_REVISION_GUIDE.md](./AbstractFactoryDesignPattern/ABSTRACT_FACTORY_REVISION_GUIDE.md)**
