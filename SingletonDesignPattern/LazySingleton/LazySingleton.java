package LazySingleton;

public class LazySingleton {

    //Private constructror to avoid initialization
    private LazySingleton() {}

    //The Single Instance Initially Null
    private static LazySingleton instance;

    //Public Method to get the instance
    public static LazySingleton getInstance()
    {
        //check if the instance is null
        if(instance == null)
        {
            //if null, create a new Instance
            instance = new LazySingleton();
        }

        //return the instance (either newly or exixting)
        return instance; 
    }
}
