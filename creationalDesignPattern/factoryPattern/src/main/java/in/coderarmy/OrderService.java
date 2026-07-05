package in.coderarmy;

public class OrderService {

    public void sentNotification(String type){
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.sendNotification(type);
        if(notification == null){
            System.out.println("No notification found");
        }
        notification.send();
    }
}
