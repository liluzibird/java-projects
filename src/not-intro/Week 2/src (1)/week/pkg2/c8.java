
package week.pkg2;

import java.util.Scanner;


public class c8
{
    String name;
    double pay;
    double hours;
    double total;
    double overtime;
    
    Scanner scan = new Scanner(System.in);
    
    public void setAskQuestions()
    {
        System.out.println("Enter the name ");
        name = scan.nextLine();
        
        System.out.println("Enter the hourly pay ");
        pay = scan.nextDouble();
        
        System.out.println("Enter the hours worked ");
        hours = scan.nextDouble();
    }
    
    public String getName(String n)
    {
        n = name;
        return n;
    }
    
    public double getPay(double p)
    {
        p = pay;
        return p;
    }
    
    public double getHours(double h)
    {
        h = hours;
        return h;
    }
    
    public double getTotal(double p, double h)
    {
        total = p * h;
        return total;
    }
    
    public double getOvertime(double p, double h)
    {
        overtime = total * 1.1;
        return overtime;
    }
}
