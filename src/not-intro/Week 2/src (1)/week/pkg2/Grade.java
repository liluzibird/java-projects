
package week.pkg2;

import java.awt.event.ActionEvent;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Grade
{
    JPanel panel = new JPanel();

    panel.setLayout(null);
    panel.add(lblEnterTestScore = new JLabel("Enter Score "));
    lblEnterScore.setBounds(70, 70, 100, 40);
        
    panel.add(txtEnterTestScore = new JTextField(7));
    txtEnterTestScore.setBounds(185, 75, 40, 40);
    
    btnOK.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            double sum = 0, average = 0, score
            String input = txtScore.getText();

            Grade var = new Grade();

            StringTokenizer st = new StringTokenizer(input, " ");
            try{
                while (st.hasMoreTokens())
                {
                    String temp = st.nextToken();
                    score = Double.parseDouble(temp);
                    var.getSum(score);
                }  
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Only space between numbers: ");
            }

            JOptionPane.shovMessageDialog(null, "Your Average Grade is " + var.getAverage());
    }

});
}
