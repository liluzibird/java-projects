import java.util.Scanner;

public class RecursiveCalls {
   public static void backwardsAlphabet(char currLetter) {
      if (currLetter == 'a') {
         System.out.println(currLetter);
      }
      else {
         System.out.print(currLetter + " ");
         backwardsAlphabet((char)(currLetter - 1));
      }
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char startingLetter;

      startingLetter = scnr.next().charAt(0);

      /* Your solution goes here  */
      backwardsAlphabet(startingLetter);

   }
}