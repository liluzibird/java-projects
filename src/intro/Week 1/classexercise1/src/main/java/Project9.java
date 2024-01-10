
public class Project9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	double amountPaid = (600 * 21.77);
    	double commission =(.02 * amountPaid);
    	double total = (amountPaid + commission);
    	
    	System.out.println("Kathryn paid " + "$" + amountPaid + " For his 123 chickens");
    	System.out.println("She paid her broker " + "$" + commission + " for the purchase");
    	System.out.println("Her total including commission paid was : " + "$" + total);
}
}