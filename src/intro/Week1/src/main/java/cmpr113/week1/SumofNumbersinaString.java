package cmpr113.week1;

import java.util.Scanner;

public class SumofNumbersinaString
{

    public static void main(String[] args)
    {
        String numbers;
        String[] tokens;
        int total = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter series of numbers seperated by commas: ");
        numbers = s.nextLine();
        
        tokens = numbers.split(",");
        
        for(String x : tokens)
        {
            total += Integer.parseInt(x);
        }
        
        System.out.println("Sum of numbers: " + total);
        
    }

}