package in.coderarmy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //says code open for extension but close for
        //modification
        //means we should add new functionality without
        //changing the old exisiting code

        PaymentService paymentService = new NetbankingService();
        paymentService.pay();

        PaymentService paymentService1 = new UpiService();
        paymentService1.pay();


    }
}
