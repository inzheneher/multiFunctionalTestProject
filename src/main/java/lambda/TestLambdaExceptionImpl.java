package lambda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLambdaExceptionImpl {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws EmptyArrayException {

        final double[] array = new double[]{1.0, 3.2, 2.6, 6.9};
        TestLambdaException lambdaException = a -> {
            if (a.length == 0) throw new EmptyArrayException();
            double sum = 0;
            for (double anA : a) {
                sum += anA;
            }
            return sum / a.length;
        };

        LOGGER.log(Level.INFO, "Среднее равно: " + lambdaException.func(array));
        LOGGER.log(Level.INFO, "Среднее нулевого массива: " + lambdaException.func(new double[0]));

    }

}
