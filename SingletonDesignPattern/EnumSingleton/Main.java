package EnumSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Enum Singleton Pattern ---");

        // Accessing the Singleton instance
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        // Print HashCodes
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        // Check reference equality
        if (instance1 == instance2) {
            System.out.println("Result: Both variables point to the EXACT SAME instance!");
        } else {
            System.out.println("Result: Instances are different!");
        }

        // Demonstrating shared state across references
        System.out.println("\n--- Testing Shared State ---");
        instance1.setCounter(42);
        System.out.println("Set counter to 42 using instance1.");
        System.out.println("Reading counter from instance2: " + instance2.getCounter());

        // Multi-threaded test to verify thread safety
        System.out.println("\n--- Testing Thread Safety ---");
        Runnable task = () -> {
            EnumSingleton threadInstance = EnumSingleton.INSTANCE;
            System.out.println(Thread.currentThread().getName() + " retrieved instance with HashCode: " + threadInstance.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAll threads safely accessed the same Enum Singleton instance.");
    }
}
