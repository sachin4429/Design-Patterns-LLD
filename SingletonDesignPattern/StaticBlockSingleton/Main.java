package StaticBlockSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Static Block Singleton Pattern ---");

        // Concurrent multi-threaded test
        System.out.println("Testing instance retrieval across multiple threads:\n");

        Runnable task = () -> {
            StaticBlockSingleton threadInstance = StaticBlockSingleton.getInstance();
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

        System.out.println("\nResult: All threads retrieved the EXACT SAME instance!");
    }
}
