
package week.pkg2;

import java.util.Scanner;


public class Company extends Employee
{
    public static void main(String[] args)
    {
        int bonus = 10000;
        
        Company e = new Company();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the address: ");
        e.Address = scan.nextLine();
        
        System.out.println("Enter the city: ");
        e.City = scan.nextLine();
        
        System.out.println("Enter the state: ");
        e.State = scan.nextLine();
        
        System.out.println("Enter the zip code: ");
        e.zip = scan.nextInt();
        
        System.out.println("Enter the age: ");
        e.age = scan.nextInt();
        
        
        System.out.println("The employee name is " + e.EmployeeName); //city, state, zip, age
        System.out.println("The salary is $" + e.salary);
        System.out.println("The bonus is $" + bonus);
        System.out.println("The address is " + e.Address);
        System.out.println("The city is " + e.City);
        System.out.println("The state is " + e.State);
        System.out.println("The zip code is " + e.zip);
        System.out.println("The age is " + e.age);
        
        System.out.println("The grand salary is $" + (e.salary + bonus));
        
    }
    
}
