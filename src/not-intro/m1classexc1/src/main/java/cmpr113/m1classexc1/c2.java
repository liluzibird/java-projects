package cmpr113.m1classexc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;


public class c2 extends JFrame
{
    public static void main (String[] args)
    {
        //#1: build the JFrame = Java Frame
        JFrame frame = new c2();
        frame.setTitle("Customer Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(450,200);
        frame.setVisible(true);
    }
    
    //#2: build the objects
    JLabel lblLastname,lblFirstname,lblAge;
    JTextField txtLastname,txtFirstname,txtAge;
    JButton btnSubmit;
    JButton btnCancel;
    
    //#3: build constructor, which allows to init the objects
    public c2()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblLastname = new JLabel("Lastname: "));
        panel.add(txtLastname = new JTextField(10));
        
        panel.add(lblFirstname = new JLabel("Firstname: "));
        panel.add(txtFirstname = new JTextField(10));
        
        panel.add(lblAge = new JLabel("Age: "));
        panel.add(txtAge = new JTextField(5));
        
        panel.add(btnSubmit = new JButton("Submit"));
        panel.add(btnCancel = new JButton ("Cancel"));
        
        add(panel);
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String lastname = txtLastname.getText().toUpperCase();
                String firstname = txtFirstname.getText().toUpperCase();
                String age = txtAge.getText();
                
                char ln, fn;
                ln = lastname.charAt(0);
                fn = firstname.charAt(0);
                
                /*
                if(lastname.equals(lastname) || firstname.equals(firstname))
                {
                    JOptionPane.showMessageDialog(null, "All names must be in upper case");
                    txtLastname.setText((lastname));
                    txtFirstname.setText((firstname));
                }
                */

                if(lastname.isEmpty() || firstname.isEmpty() || age.isEmpty() )
                {
                    JOptionPane.showMessageDialog(null, "Lastname, firstname or the age cannot be empty");
                    txtLastname.requestFocus();
                }
                
                if(Character.isLetter(ln) || (Character.isLetter(fn)));
                {
                    JOptionPane.showMessageDialog(null, "Your initials are " + ln + ","
                    + fn);
                    //txtLastname.setText("");
                    //txtFirstname.setText("");
                    txtLastname.requestFocus();
                }
                
                try
                {
                    int varAge = Integer.parseInt(txtAge.getText());
                    
                    JOptionPane.showMessageDialog(null, "Your lastname is: " + txtLastname.getText()
                    + "\n" + "Your firstname is: " + txtFirstname.getText() + "\n" + "Your age is: "
                    + + varAge);
                    
                    File f = new File("C:\\Users\\liluz\\Documents\\Skool\\SAC\\CMPR 113\\Week 1\\Customer.txt");
                    FileWriter fw = new FileWriter(f,true);
                    
                    fw.write("Your lastname is: " + txtLastname.getText()
                    + "\n" + "Your firstname is: " + txtFirstname.getText() + "\n" + "Your age is: "
                    + + varAge);
                    
                    fw.close();
                    JOptionPane.showMessageDialog(null,"recorded");
                    
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Cannot enter letters for age, try again");
                    txtAge.setText("");
                    txtAge.requestFocus();
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
