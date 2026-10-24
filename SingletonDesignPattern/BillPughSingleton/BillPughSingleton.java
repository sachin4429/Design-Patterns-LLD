package BillPughSingleton;
class BillPughSingleton{

    //private constructor to avoid initialization from outside
    private BillPughSingleton(){ }

    //Static inner class that holds the Insatnce
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new  BillPughSingleton();
    }

    // Public Method to get the instance
    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }

}