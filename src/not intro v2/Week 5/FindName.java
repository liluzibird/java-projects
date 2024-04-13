import java.util.Scanner;
import java.util.ArrayList;

public class FindName {
   public static void findName(ArrayList<String> allNames, String inquiredItem, int firstIndex, int lastIndex) {
      int rangeSize;
      int middleIndex;
      String middleValue;
   
      rangeSize = (lastIndex - firstIndex) + 1;
      middleIndex = (firstIndex + lastIndex) / 2;
      middleValue = allNames.get(middleIndex);

      if (inquiredItem.equals(middleValue)) {
         System.out.println(inquiredItem + " is found at index " + middleIndex);
      }
      else if (rangeSize == 1) {
         System.out.println(inquiredItem + " is not in the list");
      }
      else {

         /* Your code goes here */
         if (inquiredItem.compareTo(middleValue) < 0) { // inquiredItem is before middleValue
            System.out.println("Search lower half");
            findName(allNames, inquiredItem, firstIndex, middleIndex - 1);
        }
        else { // inquiredItem is after middleValue
            System.out.println("Search upper half");
            findName(allNames, inquiredItem, middleIndex + 1, lastIndex);
        }
         

      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> dataList = new ArrayList<String>();
      String inquiredItem;
      int numData;
      int i;
   
      inquiredItem = scnr.next();
      numData = scnr.nextInt();
      for (i = 0; i < numData; ++i) {
         dataList.add(scnr.next());
      }
      findName(dataList, inquiredItem, 0, dataList.size() - 1);
   }
}