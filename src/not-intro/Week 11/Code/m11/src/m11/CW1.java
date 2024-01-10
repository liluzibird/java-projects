
package m11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CW1 {
    
    public static void main(String[] args) {
        
        int searchValue = 7;
        int result;
        String input;
        char again;
        
        //searching for these numbers
        int numbers1D[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int [][]numbers2D = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};
        
            result = binarySearch(numbers2D, 0, (numbers2D.length - 1), searchValue);
            
            if (result == -1){
                System.out.println(searchValue + " was not found");
            } else {
                System.out.println("lucky number 7 is at index: " + result);
            }
    }
        
    public static int binarySearch(int[][] array, int first, int last, int value){
        int middle;
        
        if (first > last){
            return -1;
        }
        
        middle = (first + last) / 2;
        
        if (array [0][middle] == value || array[1][middle] == value)
        {
            return middle;
        }
        else if (array[0][middle] < value || array[1][middle] < value)
        {
            return binarySearch(array, middle + 1, last, value);
        }
        
        else
        {
            return binarySearch(array, first, middle - 1, value);
        }
    }
    
    public static int binarySearch1D(int[] array, int first, int last, int value)
    {
        int middle; // Mid point of search
        // Test for the base case where the
        // value is not found.
        if (first > last)
            return -1;
        // Calculate the middle position.
        middle = (first + last) / 2;
        // Search for the value.
        if (array[middle] == value)
            return middle;
        else if (array[middle] < value)
            return binarySearch1D(array, middle + 1, last, value);
        else
            return binarySearch1D(array, first, middle - 1, value);
    }
    
}
