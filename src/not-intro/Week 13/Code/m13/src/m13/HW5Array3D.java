package m13;

public class HW5Array3D {
    
    public static void main(String[] args)
    {
        int[][][] array=new int[2][3][2];
        int num=1;
        int sum=0;
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<2;k++)
                {
                    array[i][j][k]=num;
                    num++;;
                }
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<2;k++)
                {
                    sum+=array[i][j][k];
                }
            }
        }
        
        
        System.out.println("Sum of numbers is : " + sum);
        System.out.println("Average of numbers is : "+ sum/12.0);
    }
}