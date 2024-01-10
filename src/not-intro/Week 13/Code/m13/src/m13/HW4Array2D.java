package m13;

public class HW4Array2D {
    
    public static void main(String[] args)
    {
        int[][] array=new int[2][5];
        int num=1;
        int sum=0;
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                array[i][j]=num;
                num++;
            }
        }
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                sum += array[i][j];
            }
        }
        
        System.out.println("Sum of numbers is : " + sum);
        System.out.println("Average of numbers is : " + sum / 10.0);
    }
}