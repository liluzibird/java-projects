/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m14;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class c4 {
    public static void main(String[] args) {
        String input;
        double miles, kilos, x, y, addition;
        
        input = JOptionPane.showInputDialog("Enter the first number: ");
        x = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the second number: ");
        y = Double.parseDouble(input);
        
        JOptionPane.showMessageDialog(null, "Addition: " + x + " + " + y + " = " + c3.add(x, y) + "\n"
        + "Subtraction: " + x + " - " + y + " = " + c3.subtract(x, y) + "\n"
        + "Multiplication: " + x + " * " + y + " = " + c3.multiply(x, y) + "\n"
        + "Division: " + x + " / " + y + " = " + c3.divide(x, y));
        
        
    }

}
