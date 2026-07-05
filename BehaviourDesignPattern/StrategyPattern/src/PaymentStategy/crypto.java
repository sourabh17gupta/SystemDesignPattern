package PaymentStategy;

public class crypto implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("via crypto");
    }
}
