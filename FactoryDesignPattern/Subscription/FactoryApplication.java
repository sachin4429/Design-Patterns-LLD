package FactoryDesignPattern.Subscription;

public class FactoryApplication {
    public static void main(String[] args) {
        // Get Silver Subscription
        Subscription basicUser = SubscriptionFactory.createSubscription("SILVER");
        System.out.println("Plan: Silver | Price: $" + basicUser.getPrice() + " | Benefits: " + basicUser.getBenefits());

        //Get Platinum Subscription
        Subscription premiumUser = SubscriptionFactory.createSubscription("PLATINUM");
        System.out.println("Plan: Platinum | Price: $" + premiumUser.getPrice() + " | Benefits: " + premiumUser.getBenefits());
    }
}
