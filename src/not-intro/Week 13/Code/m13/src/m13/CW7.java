/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m13;

/**
 *
 * @author Student
 */
public class CW7 {
    public static void main(String[] args) {
        int[][] nums  = {{ 10, 20, 30, 40},{50, 60, 70, 80}};
        System.out.println(nums[1][0]);
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }
    }
}
