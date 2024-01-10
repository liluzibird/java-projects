import java.util.Scanner;

public class Project10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
String name, age, city ,college, profession, animal, petName;
    	//scanner
    	Scanner scan = new Scanner (System.in);
    	//input
    	System.out.println("Enter your Name:");
    	name = scan.nextLine();
    	
    	System.out.println("Enter your Age:");
    	age = scan.nextLine();
    	
    	System.out.println("Enter your City:");
    	city = scan.nextLine();
    	
    	System.out.println("Enter your College:");
    	college = scan.nextLine();
    	
    	System.out.println("Enter your Profession:");
    	profession = scan.nextLine();
    	
    	System.out.println("Enter a type of Animal:");
    	animal = scan.nextLine();
    	
    	System.out.println("Enter a Pet's Name:");
    	petName = scan.nextLine();
    	//output
    	
    	System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age +
    			 name + " went to college at " + college + ". " + name + " graduated and went to work as a\r\n" + profession + ". Then, " + name + " adoped a(n) " + animal +
    			  " named " + petName + ". They both lived happily ever after!");
    	
}
}
