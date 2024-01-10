/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m14;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class c3 {
    static String input;
    static double x, y, totalAdd, totalSub, totalMul, totalDiv;
    
    public static double milesToKilometers(double m)
    {
        return m * 1.609;
    }
    
    public static double KilometersToMiles(double k)
    {
        return k / 1.609;
    }
    
    public static double milesToKilos(double miles)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the miles");
        miles = scan.nextInt();
        
        return miles * 1.609;
    }
    
    public static double toCalculate(double x, double y)
    {
        input = JOptionPane.showInputDialog("Enter a number to add");
        x = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter a number to add");
        y = Double.parseDouble(input);
        
        totalAdd = x + y;
        
        return totalAdd;
    }
    
    public static double add(double x, double y)
    {
        return x + y;
    }
    
    public static double subtract(double x, double y)
    {
        return x - y;
    }
    
    public static double multiply(double x, double y)
    {
        return x * y;
    }
    
    public static double divide(double x, double y)
    {
        return x / y;
    }
    
}
