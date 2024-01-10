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
public class c6 {
    public static void main(String[] args) {
        c5 maltese = new c5();
        
        maltese.breed = "Maltese\n";
        maltese.size = "Small\n";
        maltese.age = 2;
        maltese.color = "white\n";
        
        System.out.println(maltese.getPetInfo());
    }
    
}
