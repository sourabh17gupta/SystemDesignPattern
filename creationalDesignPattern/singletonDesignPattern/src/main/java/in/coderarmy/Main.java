package in.coderarmy;

public class Main {
    static void main() {
//       Calculator calculator = Calculator.getInstance();
//       Calculator calculator2 = Calculator.getInstance();

        Thread t1 = new Thread(()->{
            Calculator.getInstance();
        });

        Thread t2 = new Thread(()->{
            Calculator.getInstance();
        });

        t1.start();
        t2.start();
    }
}
