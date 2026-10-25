package FactoryDesignPattern.NotificationSystem;

public class FactoryMethodApplication {
    public static void main(String[] args) {
        
        NotificationSender emailSender = new EmailSender();
        emailSender.send();

        NotificationSender smsSender = new SMSSender();
        smsSender.send();
    }
}
