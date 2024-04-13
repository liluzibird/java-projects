import java.util.Scanner;
import java.util.ArrayList;

public class Names {
   public static void createQueues(ArrayList<String> remainPassengers, ArrayList<String> pickedPassengers) {
      int i;
      String pick;
      
      /* Your code goes here */
      if (pickedPassengers.size() == 2) {
         System.out.println("No 1: " + pickedPassengers.get(0) + ", No 2: " + pickedPassengers.get(1));
     } 

      else {
         for (i = 0; i < remainPassengers.size(); ++i) {
            pick = remainPassengers.get(i);
            remainPassengers.remove(i);
            pickedPassengers.add(pick);
            
            createQueues(remainPassengers, pickedPassengers);
            
            remainPassengers.add(i, pick);
            pickedPassengers.remove(pickedPassengers.size() - 1);
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> passengersToPick = new ArrayList<String>();
      ArrayList<String> picks = new ArrayList<String>();
      int listSize;
      int i;
   
      listSize = scnr.nextInt();
   
      for (i = 0; i < listSize; ++i) {
         passengersToPick.add(scnr.next());
      }
   
      System.out.println("All possible arrangements:");
      
      createQueues(passengersToPick, picks);      
   }
}