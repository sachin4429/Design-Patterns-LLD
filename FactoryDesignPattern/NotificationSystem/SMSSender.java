package FactoryDesignPattern.NotificationSystem;

public class SMSSender extends NotificationSender{

    @Override
    protected Notification createNotification() {
       return new SMSNotification();
    }
    
}
