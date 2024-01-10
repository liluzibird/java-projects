
package cmpr113.week1;

import javax.swing.JOptionPane;
public class c1 {

    public static void main(String[] args)
    {
        String input;
        char ch;
        
        input = JOptionPane.showInputDialog(null, "enter a single character");
        
        ch = input.charAt(0);
        
        if(Character.isLetter(ch))
        {
            JOptionPane.showMessageDialog(null, " this is letter");
        }
        if(Character.isDigit(ch))
        {
            JOptionPane.showMessageDialog(null, " this is a digit");
        }
        if(Character.isLowerCase(ch))
        {
            JOptionPane.showMessageDialog(null, " this is a lower case letter");
        }
        if(Character.isUpperCase(ch))
        {
            JOptionPane.showMessageDialog(null, " this is a upper case letter");
        }
        if(Character.isSpaceChar(ch))
        {
            JOptionPane.showMessageDialog(null, " this is a space");
        }
        if(Character.isWhitespace(ch))
        {
            JOptionPane.showMessageDialog(null, " this is a whitespace letter");
        }
        System.exit(0);
    }
}
