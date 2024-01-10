/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m14;

/**
 *
 * @author User
 */
public class c8 {
    
    public static void main(String[] args) {
        
        c7 e1 = new c7();
        c7 e2 = new c7();
        c7 e3 = new c7();
        
        e1.insert(101, "Joe", 0);
        e2.insert(101, "Jane", 0);
        e3.insert(101, "Bill", 0);
        
        e1.display();
        e2.display();
        e3.display();
                
    }
    
}
