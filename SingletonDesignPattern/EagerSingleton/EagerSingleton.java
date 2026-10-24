package EagerSingleton;

public class EagerSingleton {

    //private constructor to prevent initilaization
    private EagerSingleton() {}

    // The Single Instance Created
    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance()
    {
        return instance;
    }
    
}
