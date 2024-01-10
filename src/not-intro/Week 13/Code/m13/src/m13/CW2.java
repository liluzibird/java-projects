/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m13;

import java.util.ArrayList;

/**
 *
 * @author ACC
 */
public class CW2 {
    public static void main(String[] args) {
        String[] array = {"Einstein", "Newton", "Copernicus", "Kepler"};
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        
        int total = 0;
        for (int i = 0; i < array.length; i++)
        {
            total += array[i].length();
        }
        System.out.println(total);
    }
}
