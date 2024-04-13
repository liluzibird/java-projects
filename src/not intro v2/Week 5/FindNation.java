import java.util.Scanner;
import java.util.ArrayList;

public class FindNation {
   public static void find(ArrayList<String> searchList, String nationMatch, int lowerIndex, int upperIndex) {
      int rangeSize;
      int midIndex;
      
      rangeSize = (upperIndex - lowerIndex) + 1;
      midIndex = (lowerIndex + upperIndex) / 2;

      /* Your code goes here */
      
    if (rangeSize == 1) {
        if (searchList.get(midIndex).equals(nationMatch)) {
            System.out.println(nationMatch + " is found at index " + midIndex);
        } else {
            System.out.println(nationMatch + " is not in the list");
        }
    } else {
        if (searchList.get(midIndex).compareTo(nationMatch) == 0) {
            System.out.println(nationMatch + " is found at index " + midIndex);
        } else if (searchList.get(midIndex).compareTo(nationMatch) < 0) {
            find(searchList, nationMatch, midIndex + 1, upperIndex);
        } else {
            find(searchList, nationMatch, lowerIndex, midIndex - 1);
        }
    }

   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> dataList = new ArrayList<String>();
      String nationMatch;
      int numData;
      int i;
      
      nationMatch = scnr.next();
      numData = scnr.nextInt();
      for (i = 0; i < numData; ++i) {
         dataList.add(scnr.next());
      }
      find(dataList, nationMatch, 0, dataList.size() - 1);
   }
}