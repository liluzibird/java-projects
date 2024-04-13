import java.util.Scanner;
import java.util.ArrayList;

public class FindLetter {
   public static void find(ArrayList<Character> searchList, Character matchItem, int lowIndex, int highIndex) {
      int rangeSize;
      int midIndex;
      
      rangeSize = (highIndex - lowIndex) + 1;
      midIndex = (lowIndex + highIndex) / 2;

      /* Your code goes here */
      if (searchList.get(midIndex).equals(matchItem)) {
         System.out.println(matchItem + " is found at index " + midIndex);
     }
     else if (rangeSize == 1) {
         System.out.println(matchItem + " is not in the list");
     }
     else {
         System.out.println(matchItem + " is not found at index " + midIndex);
     }

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Character> dataList = new ArrayList<Character>();
      Character matchItem;
      int numData;
      int i;
      
      matchItem = scnr.next().charAt(0);
      numData = scnr.nextInt();
      for (i = 0; i < numData; ++i) {
         dataList.add(scnr.next().charAt(0));
      }
      find(dataList, matchItem, 0, dataList.size() - 1);
   }
}