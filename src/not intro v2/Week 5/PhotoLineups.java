import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
   // Method to create and output all permutations of the list of names.
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      // Base case: if nameList is empty, output the permutation
      if (nameList.isEmpty()) {
         for (int i = 0; i < permList.size(); ++i) {
            System.out.print(permList.get(i));
            if (i < permList.size() - 1) {
               System.out.print(", ");
            }
         }
         System.out.println();
      }
      // Recursive case: for each name in nameList, create a new permutation
      else {
         for (int i = 0; i < nameList.size(); ++i) {
            // Choose
            String name = nameList.remove(i);
            permList.add(name);
            
            // Explore
            printAllPermutations(permList, nameList);
            
            // Un-choose
            permList.remove(permList.size() - 1);
            nameList.add(i, name);
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;

      // Read a list of names into nameList; stop when -1 is read.
      while (scnr.hasNext()) {
         name = scnr.next();
         if (name.equals("-1")) {
            break;
         }
         nameList.add(name);
      }

      // Call recursive method to print all permutations.
      printAllPermutations(permList, nameList);
   }
}
