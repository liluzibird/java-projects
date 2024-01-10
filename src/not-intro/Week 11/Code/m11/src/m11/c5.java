
package m11;

/**
 *
 * @author User
 */
public class c5 {
    
    public static void main(String[] args) {
        
        int[]numbers = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("The sume of elements of 2 - 5 = " + rangeSum (numbers, 0, 1));
        //System.out.println("The indexes range 2 - 5 = " rangeSum (numbers, 2, 5));
        System.out.println("Lucky number " + numbers[6]);
    }
    
    public static int rangeSum(int[] array, int start, int end)
    {
        if(start > end)
        {
            return 0;
        }
        else
        {
            return array[start] + rangeSum(array, start + 1, end);
        }
    }
}
