package lambda.method;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringFuncDemo {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static String stringRev(StringFunc a, String b) {
        return a.func(b);
    }

    public static void main(String[] args) {

        String input = "Строка подлежащая инверсии";
        String output;

        output = stringRev(StringFuncImpl::strReverse, input);

        LOGGER.log(Level.INFO, input);
        LOGGER.log(Level.INFO, output);

    }

}
