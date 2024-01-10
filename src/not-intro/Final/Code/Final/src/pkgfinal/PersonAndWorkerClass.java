package pkgfinal;

import java.util.Scanner;

public class PersonAndWorkerClass {

    public static void main(String[] args) {
        Worker w = new Worker();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Gross : ");
        String name = in.nextLine();
        
        System.out.println("Enter name: ");
        String name = in.nextLine();
        
        
        w.setGrossIncome(name);
        w.setName(name);
        w.setAddress("316 South St.");
        w.setPhone("(555)631-1228");
        w.setMailing(true);
        
        System.out.println(w);
    }

}