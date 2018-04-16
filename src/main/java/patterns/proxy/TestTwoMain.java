package patterns.proxy;

public class TestTwoMain {

    public static void main(String[] args) {

        TestTwoProxy proxyTestTwo = new TestTwoProxy(3);
        proxyTestTwo.display();
        System.out.println();
        proxyTestTwo.display();

    }

}
