import java.util.Scanner;


public class Project3 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       //variables
    	String firstName, middleName, lastName;
    	firstName = "Albert";
    	middleName = "Ted";
    	lastName= "Huynh";
    	
    	Scanner scan = new Scanner(System.in); //add scanner
    			
    	char firstInitial, middleInitial, lastInitial;
    	firstInitial = firstName.charAt(0);
    	middleInitial = middleName.charAt(0);
    	lastInitial = lastName.charAt(0);
    	
 
    	//output Project 3
    	System.out.println("My First Name is: " + firstName);
    	System.out.println("My Middle Name is: " + middleName);
    	System.out.println("My Last Name is: " + lastName);
    	System.out.println("My First Initial is: " + firstInitial);
    	System.out.println("My Middle Initial is: " + middleInitial);
    	System.out.println("My last Initial is: " + lastInitial);
    	
}
}