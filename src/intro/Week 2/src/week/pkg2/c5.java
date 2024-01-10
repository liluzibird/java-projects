
package week.pkg2;

import java.util.Scanner;


public class c5 {
    
    String name;
    double pay, hours, total;
    
    public void setAskedQuestion()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("enter the name");
        name = scan.nextLine();
        
        System.out.println("Enter hourly pay");
        pay = scan.nextDouble();
        
        System.out.println("enter hours worked");
        hours = scan.nextDouble();
    }
    
    public String getName(String n)
    {
        n = name;
        return n;
    }
    public Double getPay(double p)
    {
        p = pay;
        return p;
    }
    
    public Double getHours(double h)
    {
        h = hours;
        return h;
    }
    
    public Double getTotal(double t, double h)
    {   
        total = p * h;
        
        
        return total;
    }
}
