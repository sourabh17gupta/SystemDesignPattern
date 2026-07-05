package in.coderarmy;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Notification sent via email");
    }
}
