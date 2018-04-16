package patterns.proxy;

public class TestTwoProxy implements TestTwoInterface {

    private TestTwo testTwo;
    private int var;

    public TestTwoProxy(int var) {
        this.var = var;
    }

    @Override
    public void display() {
        if (testTwo == null) {
            testTwo = new TestTwo(var);
        }
        testTwo.display();
    }
}
