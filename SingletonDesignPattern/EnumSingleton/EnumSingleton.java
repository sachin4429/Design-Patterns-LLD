package EnumSingleton;

public enum EnumSingleton {

    // The single instance of this Enum (Convention is UPPERCASE)
    INSTANCE;

    // You can have instance variables (State)
    private int counter = 0;

    // A sample method to demonstrate functionality
    public void doSomething() {
        System.out.println("EnumSingleton is doing work! Current counter: " + counter);
    }
    //These are for uderstanding Enums;
    // Getters and setters to demonstrate shared state
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
