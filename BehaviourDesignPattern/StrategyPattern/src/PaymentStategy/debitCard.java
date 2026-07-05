package PaymentStategy;

public class debitCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("via debit card");
    }
}
