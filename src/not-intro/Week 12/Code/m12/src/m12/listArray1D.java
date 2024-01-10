
package m12;

import java.util.ArrayList;
import java.util.List;

public class listArray1D {
    public static void main(String[] args) {
        
        List <Integer> testing = new ArrayList <Integer>();
        
        int sum = 0;
        
        for(int i = 1; i <= 10; i++)
        {
            testing.add(i);
            sum += testing.get(i-1);
        }
        
        System.out.println(testing);
        System.out.println("Sum: " +sum);
        System.out.println("Average: " + sum/10);
    }
    
}
