package in.coderarmy;

public class NotificationFactory {
    public Notification sendNotification(String type){
        if(type.equals("sms")){
            return new SmsNotification();
        }
        else if(type.equals("email")){
            return new EmailNotification();
        }
        return null;
    }
}
