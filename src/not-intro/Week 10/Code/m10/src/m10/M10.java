/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class M10 extends JApplet{

JTextField txtStudentID = new JTextField(5);
JTextField txtLastname = new JTextField(5);
JTextField txtMiddlename = new JTextField(5);
JTextField txtFirstname = new JTextField(5);
JTextField txtAddress = new JTextField(5);
JTextField txtCity = new JTextField(5);
JTextField txtState = new JTextField(5);
JTextField txtZipcode = new JTextField(5);

JButton btnShowGrade = new JButton ("Show Student");


public void init()
{
    setSize (600,700);
    
    JPanel p = new JPanel();
    p.add(txtStudentID);
    p.add(txtLastname);
    p.add(txtMiddlename);
    p.add(txtFirstname);
    p.add(txtAddress);
    p.add(txtCity);
    p.add(txtState);
    p.add(txtZipcode);
    p.add(btnShowGrade);
    
            
    add(p);
}

Statement stmt;
{
    btnShowGrade.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                System.out.println("driver connected");
                
               String url = "jdbc:ucanaccess://D:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Week 10\\Code\\Studentsdb.accdb";
               Connection connect = DriverManager.getConnection(url);
               
               stmt = connect.createStatement();
               
               System.out.println("Database connected");
               
               String StudentID = txtStudentID.getText();
            
            String Query = "Select * from Students where StudentID='" + StudentID+"'";
            ResultSet rset = stmt.executeQuery(Query);

            if (rset.next())
            {
                StudentID = rset.getString(1);
                String Lastname = rset.getString(2);
                String Middlename = rset.getString(3);
                String Firstname = rset.getString(4);
                String Address = rset.getString(5);
                String City = rset.getString(6);
                String State = rset.getString(7);
                String Zipcode = rset.getString(8);
                

                JOptionPane.showMessageDialog(null, "Confirmation: " + StudentID + "\n" + Lastname + "\n" + Middlename + "\n" + Firstname + "\n" + Address + "\n" + City + "\n" + State + "\n" + Zipcode);

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Student not found");
            }
            rset.close();
            
            
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
        }
});
}
}
