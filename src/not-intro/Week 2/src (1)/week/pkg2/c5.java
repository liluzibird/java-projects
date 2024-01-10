/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg2;

import java.util.Scanner;


public class c5
{
    String name;
    double pay, hours, total;
    
    public void setAskedQuestion()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the name ");
        name = scan.nextLine();
        
        System.out.println("Enter the hourly pay ");
        pay = scan.nextDouble();
        
        System.out.println("Enter the worked");
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
    
    public Double getTotal(double p, double h)
    {
        total = p * h;
        return total;
    }    
}
