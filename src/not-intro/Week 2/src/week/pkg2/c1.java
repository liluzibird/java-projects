
package week.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class c1 extends JFrame{
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new c1();
        frame.setTitle("SIS");
        frame.pack();
        frame.setVisible(true);
        
            
    }
    JLabel lblLastname, lblFirstname, lblnumberAttempted, lblMissed;
    JTextField txtLastname, txtFirstname, txtnumberAttempted, txtMissed;
    JButton btnSubmit;
    
    public c1()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblLastname = new JLabel ("Last Name: "));
        panel.add(txtLastname = new JTextField (5));
        
        panel.add(lblFirstname = new JLabel ("First Name: "));
        panel.add(txtFirstname = new JTextField (5));
        
        panel.add(lblnumberAttempted = new JLabel ("Enter # attempted "));
        panel.add(txtnumberAttempted = new JTextField (5));
        
        panel.add(lblMissed = new JLabel ("Enter # missed: "));
        panel.add(txtMissed = new JTextField (5));
        
        panel.add(btnSubmit = new JButton ("Submit"));
        
        add(panel);
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
        String input;
        
        String lastname = txtLastname.getText();
        String firstname = txtFirstname.getText();
        int numberAttempted = Integer.parseInt(txtnumberAttempted.getText());
        int missed = Integer.parseInt(txtMissed.getText());
        
  
        c2 grade = new c2();
        
      
        c3 exam = new c3(numberAttempted,missed);

        
   
        
        JOptionPane.showMessageDialog(null, "Hello " + lastname + ", " + firstname
        + "\nEach question counts " + exam.getPointsEach()
        + "\nThe exam score " + exam.getScore()
        + "\nThe grade is " + grade.getGrade());

                
            }
        });
        
        
    }
    
}
