import java.util.Scanner;

public class BusinessData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Business business1 = new Business();
      int userNumEmployees;
      int userNumStock;

      userNumEmployees = scnr.nextInt();
      userNumStock = scnr.nextInt();

      business1.setNumEmployees(userNumEmployees);
      business1.setNumStock(userNumStock);

      System.out.println("Number of employees: " + business1.getNumEmployees());
      System.out.println("Items in stock: " + business1.getNumStock());
   }
}