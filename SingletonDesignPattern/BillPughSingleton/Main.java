package BillPughSingleton;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Bill Pugh Singleton Pattern ---");

        // Retrieve instances
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();

        // Print hash codes to verify single instance
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        // Check reference equality
        if (instance1 == instance2) {
            System.out.println("Result: Both variables point to the SAME instance in memory.");
        } else {
            System.out.println("Result: Instances are different!");
        }

        // Multi-threaded test to verify thread safety
        System.out.println("\n--- Testing Thread Safety ---");
        Runnable task = () -> {
            BillPughSingleton threadInstance = BillPughSingleton.getInstance();
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
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("\nAll threads retrieved the same singleton instance successfully.");
    }
}
