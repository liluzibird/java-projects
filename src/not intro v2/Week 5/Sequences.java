import java.util.Scanner;
import java.util.ArrayList;

public class Sequences {
   public static int makeSequence(ArrayList<Integer> remainTokens, ArrayList<Integer> pickedTokens, int numOccurrences) {
      int i;
      int pick;

      if (remainTokens.size() == 0) {

         /* Your code goes here */
         numOccurrences++;
         for (int token : pickedTokens) {
            System.out.print(token + " ");
         }
         System.out.println(": Sequence " + numOccurrences);
         return numOccurrences;

      }
      else {
         for (i = 0; i < remainTokens.size(); ++i) {
            pick = remainTokens.get(i);
            remainTokens.remove(i);
            pickedTokens.add(pick);
            
            numOccurrences = makeSequence(remainTokens, pickedTokens, numOccurrences);
            
            remainTokens.add(i, pick);
            pickedTokens.remove(pickedTokens.size() - 1);
         }
         return numOccurrences;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> tokensToPick = new ArrayList<Integer>();
      ArrayList<Integer> picks = new ArrayList<Integer>();
      int listSize;
      int i;
      
      listSize = scnr.nextInt();
     
      for (i = 0; i < listSize; ++i) {
         tokensToPick.add(scnr.nextInt());
      }
   
      System.out.println("All possible sequences:");
      
      makeSequence(tokensToPick, picks, 0);
   }
}