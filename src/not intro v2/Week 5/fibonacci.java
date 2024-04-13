import java.util.Scanner;

public class fibonacci {
   
   public static int fibonacci(int n) {
      /* Type your code here. */      
      
      if (n < 0) {
        return -1;
     } else if (n == 0) {
        return 0;
     } else if (n == 1) {
        return 1;
     } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
     }
    }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
