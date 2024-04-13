import java.util.Scanner;

public class GrowthData {
   public static void computeGrowth(int month, int population) {
      System.out.println("month: " + month + ", population: " + population);
	
		if (population >= 1600) {
         System.out.print("Rabbit population is at least 1600 in month " + month + ".");
      }

      /* Your code goes here */
      else{
        computeGrowth(month + 1, population * 4);
      }

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int population;

      population = scnr.nextInt();
		computeGrowth(1, population);
   }
}