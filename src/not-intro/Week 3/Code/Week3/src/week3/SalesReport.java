
package week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class SalesReport {
    
    public static void main(String[] args) throws IOException {
        
        final int NUM_DAYS = 30;
        String filename;
        double totalSales;
        double averageSales;
        
        filename = getFileName();
        
        totalSales = getTotalSales(filename);
        
        averageSales = totalSales / NUM_DAYS;
        
        displayResults(totalSales, averageSales);
        
        System.exit(0);
    }
    
    public static String getFileName()
    {
        String file;
        
        file = JOptionPane.showInputDialog("Enter the name of the file\n"
        + "containing 30 days of sales amounts.");
        
        return file;
    }
    
    public static double getTotalSales(String filename) throws IOException
    {
        double total = 0.0;
        double sales;
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        while(inputFile.hasNext())
        {
            sales = inputFile.nextDouble();
            
            total += sales;
        }
        
        inputFile.close();
        
        return total;
    }
        
        public static void displayResults(double total, double avg)
        {
            JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $%,.2f\n"
            + "The average daily sales were $%,.2f\n" + "The average daily sales were $%,.2f", total, avg));
        } 
}
