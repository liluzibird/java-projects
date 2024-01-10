package cmpr113.week1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;


public class WK01ClassExc1 extends JFrame
{
    public static void main(String[] args)
    {
        //#1: build the JFrame = Java Frame
        JFrame frame = new WK01ClassExc1();
        frame.setTitle("Area of Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    JLabel lblRadius;
    JTextField txtRadius;
    JButton btnSubmit;
    JButton btnCancel;
    
    public WK01ClassExc1()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblRadius = new JLabel("Radius: "));
        panel.add(txtRadius = new JTextField(5));
        
        panel.add(btnSubmit = new JButton("Submit"));
        panel.add(btnCancel = new JButton ("Cancel"));
        
        add(panel);
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double input = Double.parseDouble(txtRadius.getText());
                double area;
                char choice;
                area = Math.PI * input * input;

                 try
                 {
                     JOptionPane.showMessageDialog(null,"Area is " + String.format("%.2f", area));
                 }catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"What went wrong?");
                }
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
            
            
