package m12;

public class listArray2D {

    public static void main(String[] args) {
        
        //2D array
        int[][] array=new int[][]{{1,2,3,4,5},
                                  {6,7,8,9,10}};
        double avg;
        int sum = 0; 
        

        System.out.println("2D Array  Sum  Average");
        for(int i=0;i<array.length;i++)
        {
            int totalSum = 0;

            for(int j=0;j<array[i].length;j++){
                //print the row
                System.out.print(array[i][j]+" ");
                sum+=array[i][j];
                
                totalSum = + sum;
            }

            avg=(double)sum/10;
            

            System.out.println("  "+totalSum+"  "+avg);
        }
        
    }
    
}