package system.exit;

public class TestSystemExit {
    public static void main(String[] args) {
        try {
            System.out.println("Before EXIT");
            System.exit(Integer.parseInt(args[0]));
            System.out.println("After EXIT");
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            System.out.println("Inside finally");
            System.exit(Integer.parseInt(args[1]));
        }
    }
}
