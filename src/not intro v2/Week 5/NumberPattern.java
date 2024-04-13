import java.util.Scanner;

public class NumberPattern {
    // Recursive printNumPattern() method
    public static void printNumPattern(int num1, int num2) {
        // Base case: if num1 is negative, print it and return
        if (num1 < 0) {
            System.out.print(num1 + " ");
            return;
        }
        
        // Print the current number
        System.out.print(num1 + " ");
        
        // Recursive call: subtract num2 from num1
        printNumPattern(num1 - num2, num2);
        
        // Print the current number again on the way back up the recursive calls
        System.out.print(num1 + " ");
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        
        printNumPattern(num1, num2);
    }
}
