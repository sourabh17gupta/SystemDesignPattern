package in.coderarmy;

public class Crypto implements Payment{
    @Override
    public void pay() {
        System.out.println("pay via crypto");
    }

    //reduce functionality -- that is the case
    //the liskov break
    //so method can be broad never reduce
    @Override
    public void refund() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
