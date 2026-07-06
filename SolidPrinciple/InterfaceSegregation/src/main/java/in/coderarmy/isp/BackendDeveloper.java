package in.coderarmy.isp;

public class BackendDeveloper implements Coder,Tester {
    @Override
    public void writeCode() {
        System.out.println("writing code");
    }

    @Override
    public void test() {
        System.out.println("dev testing");
    }
}
