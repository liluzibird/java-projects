import java.util.Scanner;
import java.util.ArrayList;

public class Names2 {
   public static void createQueues(ArrayList<String> remainVisitors, ArrayList<String> pickedVisitors) {
      int i;
      String pick;
     
      if (remainVisitors.size() == 0) {
			for (i = 0; i < pickedVisitors.size(); ++i) {
				System.out.print(pickedVisitors.get(i) + " ");
			}
			System.out.println();
		}
      else {
         for (i = 0; i < remainVisitors.size(); ++i) {
            pick = remainVisitors.get(i);

            /* Your code goes here */
            remainVisitors.remove(i);
            pickedVisitors.add(pick);
            
            // Recursively call createQueues()
            createQueues(remainVisitors, pickedVisitors);
            
            // Move the element from the end of pickedVisitors back to index i of remainVisitors
            pickedVisitors.remove(pickedVisitors.size() - 1);
            remainVisitors.add(i, pick);

         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> visitorsToPick = new ArrayList<String>();
      ArrayList<String> picks = new ArrayList<String>();
      int listSize;
      int i;
     
      listSize = scnr.nextInt();
     
      for (i = 0; i < listSize; ++i) {
          visitorsToPick.add(scnr.next());
      }
   
      System.out.println("All unique orderings:");
      
      createQueues(visitorsToPick, picks);
   }
}