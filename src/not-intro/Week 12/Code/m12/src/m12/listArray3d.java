package m12;

public class listArray3d {

    public static void main(String[] args)
    {
        int[][][] array=new int[4][3][1];  
        int num=1;
        int sum=0;
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<1;k++)
                {
                    array[i][j][k]=num;
                    num++;
                    
                    System.out.println("Number "  + (num-1) + ": " + array[i][j][k]);
                }
                
            }
            
        }
        
        for(int i=0;i<4;i++)
        {                         
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<1;k++)
                {
                    sum+=array[i][j][k];
                }
            }
        }
        
        System.out.println("Sum of numbers is : "+sum);
        System.out.print("Average of numbers is : "+((float)sum/(float)12));
        
        
        
    }
}