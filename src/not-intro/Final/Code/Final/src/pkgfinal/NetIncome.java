/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NetIncome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = in.nextLine();
        
        System.out.println("Enter address: ");
        String address = in.nextLine();
        
        System.out.println("Enter city: ");
        String city = in.nextLine();
        
        System.out.println("Enter state: ");
        String state = in.nextLine();
        
        System.out.println("Enter zip code: ");
        Integer zipCode = in.nextInt();
        
        System.out.println("Enter age: ");
        Integer age = in.nextInt();
        
        System.out.println("Enter gender: ");
        in.nextLine();
        String gender = in.nextLine();
        
        System.out.println("Enter federal tax: ");
        Double FederalTax = in.nextDouble();
        
        System.out.println("Enter state tax: ");
        Double StateTax = in.nextDouble();
        
        System.out.println("Enter gross income: ");
        Double GrossIncome = in.nextDouble();
        
        double netIncome = (1- (FederalTax + StateTax)) * GrossIncome;
        
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Federal Tax: " + FederalTax);
        System.out.println("State Tax: " + StateTax);
        System.out.println("Gross Income: $" + GrossIncome);
        System.out.println("Net Income: $" + netIncome);
        
        
        
        
        
    }
    
}
