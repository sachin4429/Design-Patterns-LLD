package FactoryDesignPattern.NotificationSystem;

public abstract class NotificationSender {

    //The Formal Factory method - subclass Must Implement it.
    protected abstract Notification createNotification();

    //core Business logic used by factory method
    public void send()
    {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
