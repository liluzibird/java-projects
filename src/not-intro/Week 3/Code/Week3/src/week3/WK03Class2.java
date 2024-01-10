
package week3;


public class WK03Class2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            int numbers[] = {1,2,3};
            
            for(int i=0;i<=3;i++)
            {
                System.out.println(numbers[i]);
            }
        }
        catch(Exception ex)
        {
            System.out.println("error " + ex);
        }
    }
    
}
