package lambda;

public class TestLambdaImpl {

    private static final int t1 = 10;
    private static final int t2 = 4;
    private static TestLambda3<Integer> fibonacchiLambda = n -> n <= 2
            ? 1
            : TestLambdaImpl.fibonacchiLambda.test(n - 2) + TestLambdaImpl.fibonacchiLambda.test(n - 1);
    private static TestLambda3<Integer> getFactorialM = a -> a == 0 || a == 1 ? 1 : a * TestLambdaImpl.getFactorialM.test(a - 1);
    private static TestLambda3<String> getReverseStringM = a -> {
        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        return b.toString();
    };


    private TestLambda3<Integer> fibonacciLambda2 = n -> n <= 2
            ? 1
            : this.fibonacciLambda2.test(n - 2) + this.fibonacciLambda2.test(n - 1);

    private TestLambda3<Integer> getFactorialN = a -> a == 0 || a == 1 ? 1 : a * this.getFactorialN.test(a - 1);

    public static void main(String[] args) {

        System.out.println(getReverseStringM.test("unfortunately"));

        System.out.println(getReverseString("unfortunately"));

        System.out.println(getFactorialM.test(10));

        System.out.println(getFactorial(10));

        System.out.println(getFibonacciFromNonStaticMethod(11));

        System.out.println(fibonacchiLambda.test(9));

        System.out.println(getFibonacchiNumber(9));

        TestLambda isNumberEven = n -> (n % 2) == 0;
        TestLambda isNumberNonNegative = n -> n >= 0;
        TestLambda2 isOneNumerIncludeAnother = (a, b) -> (a % b) == 0;

        if (isNumberEven.test(2)) System.out.println("Odd!");
        if (!isNumberEven.test(3)) System.out.println("Even!");
        if (!isNumberNonNegative.test(-1)) System.out.println("Negative!");
        if (isNumberNonNegative.test(1)) System.out.println("Positive!");
        if (isOneNumerIncludeAnother.test(t1, t2)) System.out.println("t1 include t2");
        if (!isOneNumerIncludeAnother.test(t1, t2)) System.out.println("t1 NOT include t2");
    }

    private static int getFibonacchiNumber(int a) {
        if (a <= 2) return 1;
        else return getFibonacchiNumber(a - 2) + getFibonacchiNumber(a - 1);
    }

    private static int getFibonacciFromNonStaticMethod(int a) {
        return fibonacchiLambda.test(a);
    }

    private static int getFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * getFactorial(n - 1);
    }

    private static String getReverseString(String a) {
        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        return b.toString();
    }

}
