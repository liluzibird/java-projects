
package m11;

/**
 *
 * @author User
 */
public class c4 {
    
    int Factorial;
    
    //mutator method
    public void setFactorial(int number)
    {
        if(number <=1)
        {
            System.out.println("1 returned");
        }
        
        else
        {
            System.out.println("The fact # is " + number + "= " + number * factor(number-1));
            
        }
        
        Factorial = number;
        
    }
    
    public int getFactorial()
    {
        return Factorial;
    }
}
