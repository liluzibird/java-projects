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
public class CW6 {
    public static void main(String[] args) {
        int[] nums  = { 10, 20, 30, 40, 50 };
        System.out.println(nums[2]);
        for (int i = 0; i <= 4; i++) {
            System.out.print(nums[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum += nums[i];
        }
        System.out.println("\nSum: " + sum);
        
    }
    
}
