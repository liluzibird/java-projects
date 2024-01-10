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
public class c1 {

    int age = 0, zipCode;
    String lastname = null, firstname = null,
            address = null, city = null, state = null;
    char middlename;
    
    public c1()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the lastname: ");
        lastname = scan.nextLine();
        
        System.out.println("Enter the middle initial: ");
        middlename = scan.next().charAt(0);
 
        System.out.println("Enter the age: ");
        age = scan.nextInt();
                         
        System.out.println("Enter the firstname: ");
        firstname = scan.nextLine();
        firstname = scan.nextLine();

        System.out.println("Enter the address: ");
        address = scan.nextLine();
       
        System.out.println("Enter the city: ");
        city = scan.nextLine();
               
        System.out.println("Enter the state: ");
        state = scan.nextLine();
   
        System.out.println("Enter the zip code: ");
        zipCode = scan.nextInt();
                     
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return lastname + " , " + middlename + " , " + firstname;
    }
    
    public String getPersonalInfo()
    {
        return address + " , " + city + " , " + state + " , " + zipCode;
    }
}
