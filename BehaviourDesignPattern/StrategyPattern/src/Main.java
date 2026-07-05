import PaymentStategy.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new creditCard();
        PaymentStrategy debitCard = new debitCard();
        PaymentStrategy paypal = new paypal();
        PaymentStrategy crypto = new crypto();

        PaymentProcessor processor = new PaymentProcessor(creditCard);
        processor.ProcessPayment();

        //dynamiscally change to paypal strategy
        processor.setPaymentStrategy(paypal);
        processor.ProcessPayment();

        //change to crypto strategy
        processor.setPaymentStrategy(crypto);
        processor.ProcessPayment();

        //change to debitcard strategy
        processor.setPaymentStrategy(debitCard);
        processor.ProcessPayment();

    }
}