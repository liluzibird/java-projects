
package m11;

/**
 *
 * @author User
 */
public class c3 {
    
    public static void main(String[] args) {
        
        //accessor vs. mutator methods
        
        //mutator method set the actual method = setter
        //accessor method retrieves the mutator method get = getter
        
        c4 var = new c4();
        
        //mutator method
        var.setFactorial(5);
        
        //accessor method
        var.getFactorial();
    }
}
