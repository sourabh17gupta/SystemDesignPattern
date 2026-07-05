package in.coderarmy;

public class SmsNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Notification sent via sms");
    }
}
