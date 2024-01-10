import java.util.Scanner;

public class Project7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       //variables
    	int t1, t2, t3, avg;
    	//add scanner
    	Scanner scan = new Scanner(System.in);
    	//input
    	System.out.println("Enter the First Test Score: ");
    	t1 = scan.nextInt();
    	
    	System.out.println("Enter the Second Test Score: ");
    	t2 = scan.nextInt();
    	
    	System.out.println("Enter the Third Test Score: ");
    	t3 = scan.nextInt();
    	
    	//calculations
    	avg = (t1 + t2 + t3) / 3;
    	//output
    	System.out.println("First Test Score was a " + t1);
    	
    	System.out.println("First Second Score was a " + t2);
    	
    	System.out.println("First Third Score was a " + t3);
    	System.out.println("Your Average Test Score was a " + avg);
}
}