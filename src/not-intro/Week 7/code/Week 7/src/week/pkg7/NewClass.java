
package week.pkg7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NewClass extends JFrame{
    
    public static final String Firstnames[] = {"Bill", "Gerri", "Greg", "Kirk", "Phillip", "Susan"};
    
    public static void main(String[] args) {
        JFrame frame = new NewClass();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            JMenu menu, submenu;
            JMenuItem i1, i2, i3;
            
            JMenuBar mb = new JMenuBar();
            
            menu = new JMenu("File");
            
            submenu = new JMenu(">>");
            
            i1 = new JMenuItem("New");
            i2 = new JMenuItem("Exit");
            i3 = new JMenuItem("Transfer Names to text file");
            
                menu.add(i1);
                menu.add(i2);
                
                submenu.add(i3);
                menu.add(submenu);
                
                mb.add(menu);
                
                frame.setJMenuBar(mb);
                
                frame.setVisible(true);
                
                i1.addActionListener(new ActionListener ()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new NewJFrame2().setVisible(true);
                        frame.setVisible(false);
                    }
                });

                i2.addActionListener(new ActionListener ()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        int reply = JOptionPane.showConfirmDialog(null, " EXIT ?", "EXIT", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION)
                    {
                    JOptionPane.showMessageDialog(null, "Sorry to see you go");
                    System.exit(0);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Glad you stayed");
                        }
    }
                });
                i3.addActionListener(new ActionListener ()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        try
                        {
                            File f = new File("D:\\CMPR 113\\Week 7\\code\\Week 7\\Names.txt");
                            FileWriter fw = new FileWriter(f,true);
                            
                            fw.write(Firstnames[0]);
                            fw.close();
                                JOptionPane.showMessageDialog(null,"Transferred");
                        }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(null,ex);
                            }
                    }
                    });
                }
    public JList lstNames;
    public JLabel lblNames;
    public JTextField txtNames;
    public JButton btnNames;
    
    NewClass()
    {
        JPanel p1 = new JPanel();

        p1.add(lblNames = new JLabel ("Enter a name"));
        p1.add(txtNames = new JTextField(7));
        p1.add(btnNames = new JButton("Pass Name to List Box"));

        String Firstnames[] = {"Bill", "Gerri", "Greg", "Kirk", "Phillip", "Susan"};

       JList lstNames = new JList(Firstnames);
       p1.add(lstNames);
       add(p1);

       btnNames.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String names = txtNames.getText();

                    if(lstnames.getSelectedIndex() == 0)
                    {
                        JOptionPane.showMessageDialog(null, lstNames.getSelectedValue());
                    }
                    else if (lstNames.getSelectedIndex() == 3)
                    {
                        JOptionPane.showMessageDialog(null, lstNames.getSelectedValue());
                    }
         }

     });

       lstNames.addSelectionListener(new ListSelectionListener()
            {
                public void valueChanged(ListSelectionEvent evt)
                {
                    
                    if(lstnames.getSelectedIndex() == 2)
                    {
                        JOptionPane.showMessageDialog(null, lstNames.getSelectedValue());
                    }
                    else if (lstNames.getSelectedIndex() == 3)
                    {
                        JOptionPane.showMessageDialog(null, lstNames.getSelectedValue());
                    }
         }

     });
     }
     }
