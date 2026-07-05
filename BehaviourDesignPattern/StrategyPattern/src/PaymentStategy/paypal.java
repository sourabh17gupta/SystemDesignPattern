package PaymentStategy;

public class paypal implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("via paypal system");
    }
}
