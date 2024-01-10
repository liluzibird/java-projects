/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m13;

/**
 *
 * @author ACC
 */
public class CW5 {
    public static void main(String[] args) {
        int[][] grades = new int[30][10];
        
        final int NUM_ROWS = 30;
        final int NUM_COLS = 10;
        int total = 0;
        double average;
        for (int row = 0; row < grades.length; row++) {
            for (int col = 0; col < grades[row].length; col++) {
                total += grades[row][col];
            }
        }
        average = (double) total / (NUM_ROWS * NUM_COLS);
    }
    
}
