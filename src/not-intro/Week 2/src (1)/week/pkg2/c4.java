
package week.pkg2;

import java.text.NumberFormat;


public class c4
{
    public static void main(String[] args) {
        c5 var = new c5();
        
        var.setAskedQuestion();
        
        String name = var.getName("");
        double pay = var.getPay(0);
        double hours = var.getHours(0);
        double total = var.getTotal(pay, hours);
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        System.out.println("The name " + name);
        System.out.println("Hour pay " + currency.format(pay));
        System.out.println("The hours worked " + hours);
        System.out.println("Total pay is " + currency.format(total));
    }
    
}
