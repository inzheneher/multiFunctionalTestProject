package lambda.method;

class StringFuncImpl {
    static String strReverse(String a) {
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            result += a.charAt(i);
        }
        return result;
    }
}
