public class Business {
    private int numStock;
     private int numSold;
    private int numEmployees;
 
    public void setNumStock(int newNumStock) {
       numStock = newNumStock;
    }
 
     public void setNumSold(int newNumSold) {
         numSold = newNumSold;
     }
 
    /* Your code goes here */
    public void setNumEmployees(int newNumEmployees){
      numEmployees = newNumEmployees;
    }
 
    public int getNumStock() {
       return numStock;
    }
 
     public int getNumSold() {
         return numSold;
     }
 
    public int getNumEmployees() {
       return numEmployees;
    }
 }