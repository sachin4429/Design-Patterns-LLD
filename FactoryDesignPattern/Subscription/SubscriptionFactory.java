package FactoryDesignPattern.Subscription;

public class SubscriptionFactory {
    
    //The factory method
    public static Subscription createSubscription(String type)
    {
        if(type.isEmpty() || type == null)
        {
            return null;
        }

        switch(type.toUpperCase())
        {
            case "SILVER" :
                return new Silver();
            case "GOLD" :
                return new Gold();
            case "PLATINUM" :
                return new Platinum();
            default :
                throw new IllegalArgumentException("Unknown Subscriptiion Type : "+ type);
        }
    }
}
