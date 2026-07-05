package PaymentStategy;

public class creditCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("via credit card");
    }
}
