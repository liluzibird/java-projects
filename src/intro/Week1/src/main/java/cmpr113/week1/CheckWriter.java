package cmpr113.week1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;


public class CheckWriter extends JFrame
{
    public static void main(String[] args)
    {
        //#1: build the JFrame = Java Frame
        JFrame frame = new CheckWriter();
        frame.setTitle("Check Writer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    JLabel lblDate;
    JTextField txtDate;
    JLabel lblName;
    JTextField txtName;
    JLabel lblAmount;
    JTextField txtAmount;
    JButton btnSubmit;
    JButton btnCancel;
    
    public CheckWriter()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblDate = new JLabel("Date: "));
        panel.add(txtDate = new JTextField(10));
        
        panel.add(lblName = new JLabel("Name: "));
        panel.add(txtName = new JTextField(10));
        
        panel.add(lblAmount = new JLabel("Amount ($): "));
        panel.add(txtAmount = new JTextField(10));
        
        panel.add(btnSubmit = new JButton("Submit"));
        panel.add(btnCancel = new JButton ("Cancel"));
        
        add(panel);
        
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,"                                                                  Date:"
                + "\n" + "                                                                  " + txtDate.getText() + "\n"
                + "Pay to the Order of: " + txtName.getText() + "      $" + txtAmount.getText() + "\n"
                + "One thousand nine hundred twenty and 85" + "\ncents");
                 
        }
        });
        
        btnCancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
                }
}
            
            
