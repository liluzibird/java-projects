
package m11;

/**
 *
 * @author User
 */
public class c1 {
    
    public static void main(String[] args) {
        
        //Factorial is a number assigned? 5, 6, 100
        //factorial !5 1 + 2 + 3 + 4 + 5 + = 15
        
        System.out.println(fact (10, 12));
    }
    
    public static long fact(long number, long number1)
    {
        if(number <= 1)
        {
            return 1;
        }
        else
        {
            return number * number1 * fact(number -1, number1 -1);
            
        }
    }
}
