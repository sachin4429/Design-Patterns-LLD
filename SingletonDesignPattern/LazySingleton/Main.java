package LazySingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Lazy Singleton (Single-Threaded) ---");

        // Retrieve instances
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        // Print hash codes to verify single instance in single-threaded mode
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        if (instance1 == instance2) {
            System.out.println("Result: In single-threaded execution, both variables point to the SAME instance.");
        } else {
            System.out.println("Result: Instances are different!");
        }
    }
}
