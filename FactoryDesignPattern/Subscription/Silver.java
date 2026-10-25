package FactoryDesignPattern.Subscription;

public class Silver implements Subscription{

    @Override
    public String getBenefits() {
        return "Standart Support, 720p Resolution";
    }

    @Override
    public int getPrice() {
       return 10;
    }
    
}
