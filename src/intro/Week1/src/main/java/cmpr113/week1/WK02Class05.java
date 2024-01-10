package cmpr113.week1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class WK02Class05 extends JFrame
{
    public static void main(String[] args)
    {
        //#1: build the JFrame = Java Frame
        JFrame frame = new WK02Class05();
        frame.setTitle("String Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    JLabel lblInput;
    JTextField txtInput;
    JButton btnSubmit;
    JButton btnCancel;
    
    public WK02Class05()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblInput = new JLabel("Input: "));
        panel.add(txtInput = new JTextField(10));
        
        panel.add(btnSubmit = new JButton("Submit"));
        panel.add(btnCancel = new JButton ("Cancel"));
        
        add(panel);
        
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                String input = txtInput.getText();
                input = txtInput.getText();
                char[] array = input.toCharArray();
                int letters = 0;
                int digits = 0;
                int whitespaces = 0;

                for (int i = 0; i < array.length; i++)
                {
                    if (Character.isLetter(array[i]))
                    {
                        letters++;
                    }
                    else if (Character.isDigit(array[i]))
                    {
                        digits++;
                    }
                    else if(Character.isWhitespace(array[i]))
                    {
                        whitespaces++;
                    }
                }
                 
                 {
                     JOptionPane.showMessageDialog(null,"This string contains " + letters + " letters, "
        + digits + " digits, and " + whitespaces + " whitespace characters.");
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
            
            

        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        String input;
        char[] array;
        int letters = 0, digits = 0, whitespaces = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string: " );
        input = keyboard.nextLine();
        
        array = input.toCharArray();
        
        for (int i = 0; i < array.length; i++)
        {
            if (Character.isLetter(array[i]))
            {
                letters++;
            }
            else if (Character.isDigit(array[i]))
            {
                digits++;
            }
            else if(Character.isWhitespace(array[i]))
            {
                whitespaces++;
            }
        }
        
        System.out.println("That string contains " + letters + " letters, "
        + digits + " digits, and " + whitespaces + " whitespace characters.");
        
    }
}
*/