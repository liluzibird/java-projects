
package week.pkg2;


public class c9
{
    public static void main(String[] args)
    {
        c8 obj = new c8();
        
        obj.setAskQuestions();
        
        String name = obj.getName("");
        double pay = obj.getPay(0);
        double hours = obj.getHours(0);
        double total = obj.getTotal(pay, hours);
        double overtime = obj.getOvertime(pay, hours);
        
        if (hours > 40)
        {
            System.out.println("The name is " + name);
            System.out.println("The hourly pay is $" + pay);
            System.out.println("The hours worked is " + hours);
            System.out.println("The total pay is $" + overtime);
        }
        else
        {
            System.out.println("The name is " + name);
            System.out.println("The hourly pay is $" + pay);
            System.out.println("The hours worked is " + hours);
            System.out.println("The total pay is $" + total);
        }
    }
}
