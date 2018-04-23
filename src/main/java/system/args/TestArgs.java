package system.args;

import java.util.Arrays;

public class TestArgs {

    public static void main(String[] args) {

        System.out.println("Hi, " + args[0]);
        System.out.println("Your age is " + args[1]);
        System.out.println("Args length: " + args.length);

        int[] arr = new int[]{};
        System.out.println(Arrays.toString(arr));
        arr[0] = 5;

        System.out.println(arr);
    }

}
