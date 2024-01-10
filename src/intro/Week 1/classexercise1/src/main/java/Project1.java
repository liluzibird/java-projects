import java.util.Scanner;


public class Project1 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String name;
        
        int age; //int for whole numbers
        
        double annualPay; //the double data-type
        //allows for precision points
        //example 23.23
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your Name");
        name = scan.nextLine();
        
        System.out.println("Enter your age");
        age = scan.nextInt();
        
        System.out.println("Enter your annualPay");
        annualPay = scan.nextDouble();
        
        System.out.println("My name is " + name + ", "
                + "my age is " + age + " and\n" + "I hope to earn $"
                + annualPay + " per year.");
}
}