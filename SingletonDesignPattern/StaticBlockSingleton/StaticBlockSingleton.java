package StaticBlockSingleton;

public class StaticBlockSingleton {
    
    //Private Constructor to prevent initialization
    private StaticBlockSingleton() {}

    //The single instace
    private static StaticBlockSingleton instance;
    
    //Static block for Initialization
    static
    {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured while creating singl;eton instance");
        }
    }

    //Public Method to get the instance
    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}
