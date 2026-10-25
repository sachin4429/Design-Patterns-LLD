package FactoryDesignPattern.Subscription;

public class Gold implements Subscription{

    @Override
    public String getBenefits() {
        return "Priority Support, 1080p Resolution";
    }

    @Override
    public int getPrice() {
       return 20;
    }
    
}
