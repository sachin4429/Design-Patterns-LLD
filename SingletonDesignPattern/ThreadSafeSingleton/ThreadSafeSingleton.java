package ThreadSafeSingleton;


public class ThreadSafeSingleton {
    //Private constructror to avoid initialization
    private ThreadSafeSingleton() {}

    //The Single Instance Initially Null
    private static ThreadSafeSingleton instance;

    //Public Method to get the instance with Synchronized Keyward to allw only 1 at a time
    public static synchronized ThreadSafeSingleton getInstance()
    {
        //check if the instance is null
        if(instance == null)
        {
            //if null, create a new Instance
            instance = new ThreadSafeSingleton();
        }

        //return the instance (either newly or exixting)
        return instance; 
    }
}
