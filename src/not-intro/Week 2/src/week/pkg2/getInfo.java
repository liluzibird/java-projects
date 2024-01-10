
package week.pkg2;
import javax.swing.JOptionPane;

public class getInfo {
    public static void main(String[] args)
    {
        String address, state, city, zipCode, grade;
        double testScore;
        
        address = JOptionPane.showInputDialog(null, "Enter address" );
        state = JOptionPane.showInputDialog(null, "Enter state" );
        city = JOptionPane.showInputDialog(null, "Enter city" );
        zipCode = JOptionPane.showInputDialog(null, "Enter Zip Code" );
        grade = JOptionPane.showInputDialog(null, "Enter grade" );
        
        info c2 = new info(address, state, city, zipCode, grade);
        
        JOptionPane.showMessageDialog(null, "Address: " + address
        + "\nState: " + state + "\nCity: " + city + "\nZip Code: " + zipCode
        + "\nGrade: " + grade);
        
    }
}
