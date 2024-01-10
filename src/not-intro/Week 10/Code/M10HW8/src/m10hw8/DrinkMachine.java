package m10hw8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrinkMachine extends JFrame
implements ActionListener {

        private JButton button1;
        private JButton button2;

        public static void main (String [] args) {
            DrinkMachine frame = new DrinkMachine () ;
            frame.setSize (400, 300) ;
            frame.createGUI () ;
            frame.show () ;
        }

        private void createGUI() {
            setDefaultCloseOperation (EXIT_ON_CLOSE) ;
            Container window = getContentPane () ;
            window.setLayout (new FlowLayout () ) ;

            //First button
            button1 = new JButton ("cola      1,15 Û") ;
            window.add (button1) ;
            button1.addActionListener (this) ; 

            //Second button
            button2 = new JButton ("Water      0,85 Û") ;
            window.add (button2) ;
            button2.addActionListener (this) ; 
        }

        public void actionPerformed (ActionEvent event) {
            int cents;
            int euros;
            int change;
            int changeCents;
            int changeEuros;

            //Makes windows that ask for money
            String centsString;
            String eurosString;
            eurosString = JOptionPane.showInputDialog ("Enter Û (Euros)") ;
            centsString = JOptionPane.showInputDialog ("Enter c (Cents)") ;
            cents = Integer.parseInt (centsString);
            euros = Integer.parseInt (eurosString) * 100;

            //Calculate the change
            String command = event.getActionCommand();
            if(command == "cola $0.75 Û")
            {
            change = (cents + euros) - 115;
            }
            else
            {
            change = (cents + euros) - 85;
            }

            //Splits up the change
            changeCents = change % 100;
            changeEuros = change / 100;
            //Tells the change
            JOptionPane.showMessageDialog (null, 
                "Change breakes down into:" + 
                "   Euros: " + changeEuros + 
                "   Cents: " + changeCents);
            //Tells how the cents come out    
            int CentsDecimale;
            int CentsJednine;
            CentsDecimale = changeCents / 10;
            CentsJednine = changeCents - (CentsDecimale * 10);
            JOptionPane.showMessageDialog (null, 
                "Change in Cents coming out:" + 
                "     " + 
                CentsDecimale + 
                " *10c" + 
                "     " +
                CentsJednine + 
                " *1c");
            //Tells how the euros come out
            int NEuros;
            NEuros = changeEuros / 1;
            JOptionPane.showMessageDialog (null, 
            "Change in Euros comming out:     " + 
            NEuros + 
            " *1Û");

        }
    }
