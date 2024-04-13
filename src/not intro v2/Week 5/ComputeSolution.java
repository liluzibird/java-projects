import java.util.Scanner;

public class ComputeSolution {
   public static int computePowers(int inValue) {
      int product;

      /* Your code goes here */
      if (inValue == 0) {
        System.out.println("5 to the power of 0 is 1");
        return 1;
     }

      else {
         product = 5 * computePowers(inValue - 1);
			System.out.println("5 to the power of " + inValue + " is " + product);
			return product;
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inValue;

      inValue = scnr.nextInt();
      computePowers(inValue);
   }
}