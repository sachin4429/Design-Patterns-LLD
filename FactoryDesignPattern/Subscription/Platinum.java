package FactoryDesignPattern.Subscription;

public class Platinum implements Subscription{

    @Override
    public String getBenefits() {
        return "24/7 Support, 4K Resolution";
    }

    @Override
    public int getPrice() {
       return 30;
    }
    
}
