package lambda;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Массив пуст...");
    }
}
