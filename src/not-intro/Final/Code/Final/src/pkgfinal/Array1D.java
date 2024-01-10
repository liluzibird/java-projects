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
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }
        
        double average = sum / numArray.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
