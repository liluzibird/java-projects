
package week.pkg5;


public class c1 extends JFrame{
    
    
    public static void main(String[] args) {
        
        c1 frame = new c1();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ONCLOSE);
        frame.setTitle("message");
        frame.setVisible(true);
        
        //Graphics Class
    }
    JRadioButton rdoRed, rdoYellow,rdoGreen;
    JButton btnLeft = new JButton("<--"), btnRight = new JButton("==>");
    JTextField txtMessage = new JTextField("Java is Cool");
    c1()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,5));
        panel.add(rdoRed = new JRadioButton("red"));
        panel.add(rdoYellow = new JRadioButton("yellow"));
        panel.add(rdoGreen = new JRadioButton("green"));
        
        panel.setBorder(new TitledBorder("Select Message Panel Background"));
        add(panel,BorderLayout.SOUTH);
        
        this.add(txtmessage,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.add(btnLeft);
        panel2.add(btnRight);
        add(panel2, BorderLayout.EAST);
        
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(rdoRed);
        bg.add(rdoYellow);
        bg.add(rdoGreen);
        
        rdoRed.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txtMessage.setBackground(Color.red);
            }
        });
        
        rdoYellow.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txtMessage.setBackground(Color.yellow);
            }
        });
        
        rdoGreen.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txtMessage.setBackground(Color.green);
            }
        });
        
        
        
    }
    
}
