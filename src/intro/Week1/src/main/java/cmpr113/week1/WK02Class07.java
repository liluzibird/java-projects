package cmpr113.week1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;


public class WK02Class07 extends JFrame
{
    public static void main (String[] args)
    {
        //#1: build the JFrame = Java Frame
        JFrame frame = new WK02Class07();
        frame.setTitle("Names");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(450,200);
        frame.setVisible(true);
    }
    
    //#2: build the objects
    JLabel lblFirstname,lblMiddlename,lblLastname;
    JTextField txtLastname,txtFirstname,txtMiddlename;
    JButton btnSubmit;
    JButton btnCancel;
    
    //#3: build constructor, which allows to init the objects
    public WK02Class07()
    {
        JPanel panel = new JPanel();
                
        panel.add(lblFirstname = new JLabel("Firstname: "));
        panel.add(txtFirstname = new JTextField(10));
        
        panel.add(lblMiddlename = new JLabel("Middlename: "));
        panel.add(txtMiddlename = new JTextField(10));
        
        panel.add(lblLastname = new JLabel("Lastname: "));
        panel.add(txtLastname = new JTextField(10));

        panel.add(btnSubmit = new JButton("Submit"));
        panel.add(btnCancel = new JButton ("Cancel"));
        
        add(panel);
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String lastname = txtLastname.getText().toUpperCase();
                String Middlename = txtMiddlename.getText().toUpperCase();
                String firstname = txtFirstname.getText().toUpperCase();
                
                
                /*
                if(lastname.equals(lastname) || firstname.equals(firstname))
                {
                    JOptionPane.showMessageDialog(null, "All names must be in upper case");
                    txtLastname.setText((lastname));
                    txtFirstname.setText((firstname));
                }
                */

                if(lastname.isEmpty() || firstname.isEmpty() || Middlename.isEmpty() )
                {
                    JOptionPane.showMessageDialog(null, "Firstname, Middlename, or Lastname cannot be empty");
                    txtFirstname.requestFocus();
                }
                
                try
                {
                    
                    JOptionPane.showMessageDialog(null,"Your firstname is: " + txtFirstname.getText() + "\n"
                    + "Your middlename is: " + txtMiddlename.getText() + "\n"
                    + "Your lastname is: " + txtLastname.getText());
                    
                    File f = new File("C:\\Users\\liluz\\Documents\\Skool\\SAC\\CMPR 113\\Week 1\\Names.txt");
                    FileWriter fw = new FileWriter(f,true);
                    
                    fw.write("Your firstname is: " + txtFirstname.getText() + "\n"
                    + "Your middlename is: " + txtMiddlename.getText() + "\n"
                    + "Your lastname is: " + txtLastname.getText() + "\n"
                    + "-----------------------------------------------\n");
                    
                    fw.close();
                    JOptionPane.showMessageDialog(null,"recorded");
                    
                }
                catch(Exception ex)
                {
                    
                }
            }
        });
        
        btnCancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "BYE");
                System.exit(0);
            }
        });
    }
}
