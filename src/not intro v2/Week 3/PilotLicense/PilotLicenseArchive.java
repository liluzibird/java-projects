import java.util.Scanner;

public class PilotLicenseArchive {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      PilotLicense pilot1 = new PilotLicense();
      int userFee;
      int userId;

      userFee = scnr.nextInt();
      userId = scnr.nextInt();

      pilot1.setFee(userFee);
      pilot1.setId(userId);

      System.out.println("License fee: " + pilot1.getFee());
      System.out.println("License id: " + pilot1.getId());
   }
}