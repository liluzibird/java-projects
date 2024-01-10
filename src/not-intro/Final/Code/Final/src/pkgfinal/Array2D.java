/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author User
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array=new int[2][15];
        int num=1;
        int sum=0;
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<15; j++)
            {
                array[i][j]=num;
                num++;
            }
        }
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<15; j++)
            {
                sum += array[i][j];
            }
        }
        
        System.out.println("Sum of numbers is : " + sum);
        System.out.println("Average of numbers is : " + sum / 30.0);
    }
}
