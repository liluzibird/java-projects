import java.util.Scanner;

public class FindSolution {
    public static int computePowers(int val) {
        int result;
        /* Your code goes here */
        if (val == 0) {
            System.out.println("5 to the power of 0 is 1");
            return 1;
        }
        else {
            result = 5 * computePowers(val - 1);
            System.out.println("5 to the power of " + val + " is " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int val;
        val = scnr.nextInt();
        computePowers(val);
    }
}
