import java.util.Scanner;

public class digitCount {
    // Recursive digitCount() method
    public static int digitCount(int num) {
        // Base case: if num is less than 10, return 1 (since it's a single digit)
        if (num < 10) {
            return 1;
        }
        // Recursive case: divide num by 10 and add 1 to the count
        else {
            return 1 + digitCount(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num, digits;
        num = scnr.nextInt();
        digits = digitCount(num);
        System.out.println(digits);
    }
}
