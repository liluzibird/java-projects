import java.util.Scanner;

public class ExponentMethod {
   public static int raiseToPower(int baseVal, int exponentVal) {
      int resultVal;

      if (exponentVal == 0) {
         resultVal = 1;
      }
      else {
         resultVal = baseVal * raiseToPower(baseVal, exponentVal - 1)/* Your solution goes here  */;
      }

      return resultVal;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userBase;
      int userExponent;

      userBase = scnr.nextInt();
      userExponent = scnr.nextInt();
      System.out.println(userBase + "^" + userExponent + " = "
        + raiseToPower(userBase, userExponent));
   }
}