import java.util.Scanner;

public class MerchandiseCount {
    public static void purchases(int totalDay, int day, int amount) {
        if (day == totalDay) {
            System.out.println("Day: " + totalDay + ", amount: " + amount);
        }
        else {
            /* Your code goes here */
            if (day % 3 == 0) {
                purchases(totalDay, day + 1, amount - 4);
            }
            else {
                purchases(totalDay, day + 1, amount - 13);
            }
        }/*  */
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalDay;
        int amount;
        totalDay = scnr.nextInt();
        amount = scnr.nextInt();
        purchases(totalDay, 1, amount);
    }
}
