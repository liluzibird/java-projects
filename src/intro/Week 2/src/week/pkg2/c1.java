
package week.pkg2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class c1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new c1();
        frame.setTitle("SIS");
        frame.pack();
        String input;
        frame.setVisible(true);
        
        
        
        double testScore;
        
        int questions, missed;
        
        
        
        c2 grade = new c2();
        
        input = JOptionPane.showInputDialog("enter # of questions");
        questions = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("enter $ of missed questions");
        missed = Integer.parseInt(input);
        
        c3 exam = new c3(questions,missed);
        
        input = JOptionPane.showInputDialog("enter a score between 0-100");
        testScore = Double.parseDouble(input);
        
        grade.setScore(testScore);
        
        JOptionPane.showMessageDialog(null, "the letter grade is " + grade.getGrade());
        
        JOptionPane.showMessageDialog(null, "each question counts " + exam);
    
    }
    JLabel lblLastname, lblFirstname, lblnumberAttempted, lblMissed;
    JTextField txtLastname, txtFirstname, txtnumberAttempted, txtMissed;
    JButton btnSubmit;
    
    public c1()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblLastname = new JLabel ("Lastname: "));
        panel.add(txtLastname = new JTextField (5));
        
        panel.add(lblFirstname = new JLabel ("Firstname: "));
        panel.add(txtFirstname = new JTextField (5));
        
        panel.add(lblnumberAttempted = new JLabel ("Enter # attempted "));
        panel.add(txtnumberAttempted = new JTextField (5));
        
        panel.add(lblMissed = new JLabel ("Missed: "));
        panel.add(txtMissed = new JTextField (5));
        
        panel.add(btnSubmit = new JButton ("Submit"));
        
        add(panel);
        
        btnSubmit.addActionListener(new ActionListener()
        {
            
        });
        
        
    }
    
}
