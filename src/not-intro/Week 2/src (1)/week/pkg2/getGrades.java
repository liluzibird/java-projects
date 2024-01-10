
package week.pkg2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class getGrades extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new getGrades();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,250);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    private final JLabel lblEnterTestScore;
    private final JTextField txtEnterTestScore;
    private final JButton btnGetTestScore;
    
    public getGrades()
    {
        JPanel panel = new JPanel();
        
        panel.setLayout(null);
        
        panel.setBackground(Color.ORANGE);
        
        panel.add(lblEnterTestScore = new JLabel("enter test Score"));
        lblEnterTestScore.setBounds(70, 70, 100, 40);
        
        panel.add(txtEnterTestScore = new JTextField(7));
        txtEnterTestScore.setBounds(185, 75, 40, 40);
        
        panel.add(btnGetTestScore = new JButton("Get Score"));
        btnGetTestScore.setBounds(155, 155, 100, 50);
        
        add(panel);
        
        btnGetTestScore.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        String input = txtEnterTestScore.getText();
                        double testScore;
                        
                        testScore = Double.parseDouble(input);
                        
                        GradesGUI var = new GradesGUI();
                        var.setScore(testScore);
                        
                        JOptionPane.showMessageDialog(null, "The grade is "
                        + var.getGrade());
                        txtEnterTestScore.setText(null);
                        txtEnterTestScore.requestFocus();
                        
                            try
                            {
                                File f = new File("D:\\CMPR 113\\Week 2\\Scores.txt");
                                FileWriter fw = new FileWriter(f,true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(var.getGrade());
                                bw.newLine();
                                bw.close();

                                System.out.println("score written");
                            }
                            
                            catch(Exception ex)
                            {
                                System.out.println(ex);
                            }
                    }
});
}
}
