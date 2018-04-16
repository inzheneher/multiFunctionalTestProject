package proxy;

public class TestTwo implements TestTwoInterface {

    private int var;

    public TestTwo(int var) {
        this.var = var;
        printSecretPassword(var);
    }

    @Override
    public void display() {
        System.out.println("var = " + var);
    }

    private void printSecretPassword(int var) {
        System.out.println("Secret password equals = " + var);
    }
}
