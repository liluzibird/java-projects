/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class c5 {
    
    String breed, size, color;
    int age;
    
    public String getPetInfo()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the breed: ");
        breed = scan.nextLine();
        
        System.out.println("Enter the size: ");
        size = scan.nextLine();
        
        System.out.println("Enter the color: ");
        color = scan.nextLine();
        
        System.out.println("Enter the age");
        age = scan.nextInt();
        
        return ("Breed is: " + breed + "\nSize is: " + size + "\nAge is: " + age + "\nColor is: " + color);
    }
    
}
