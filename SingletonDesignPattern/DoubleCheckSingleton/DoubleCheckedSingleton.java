package DoubleCheckSingleton;

public class DoubleCheckedSingleton {

    //private custructor to prevent initilaization
    private DoubleCheckedSingleton() {}

    // The Single Instance, Initially null, marked as volatile
    private static volatile DoubleCheckedSingleton instance;

    //public method to get the instance
    public static DoubleCheckedSingleton getInstance()
    {
        //FirstCheck (not  synchronized)
        if(instance == null)
        {
            // synchronized ont the class object
            synchronized (DoubleCheckedSingleton.class)
            {
                //Second check (Synchronized)
                if(instance == null)
                {
                    //create the instance
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
    
}
