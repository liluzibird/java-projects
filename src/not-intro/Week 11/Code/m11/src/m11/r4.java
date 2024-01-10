
package m11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class r4 {
    
    public static void main(String[] args) {
        
        int searchValue;
        int result;
        String input;
        char again;
        
        //searching for thesee numbers
        int numbers[] = {101, 142, 147, 189, 207, 222, 234, 289, 296, 310, 319, 388, 394, 417, 429, 447, 521, 536, 600};
        
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.println("Enter a value to search: ");
            searchValue = scan.nextInt();
            
            //Search for the value starting with 0
            result = binarySearch(numbers, 0, (numbers.length -1), searchValue);
            
        }
    }
}
