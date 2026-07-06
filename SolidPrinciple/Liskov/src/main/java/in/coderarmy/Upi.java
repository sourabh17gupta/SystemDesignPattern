package in.coderarmy;

public class Upi implements Payment {
    @Override
    public void pay() {
        System.out.println("pay via upi");
    }

    @Override
    public void refund() {
        System.out.println("refund via upi");
    }
}
