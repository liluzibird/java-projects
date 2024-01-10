/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10;


import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *f
 * @author User
 */
public class StudentRegistration extends JFrame {
    Statement stmt;
    
    JLabel lblStudentID, lblLastname, lblFirstname, lblAddress, lblCity, lblState, lblZipcode;
    JTextField txtStudentID, txtLastname, txtFirstname, txtAddress, txtCity, txtState, txtZipcode;
    JButton btnSubmit, btnInsert, btnUpdate, btnDelete;
    
    
    public static void main(String[] args) {
        JFrame frame = new StudentRegistration();
        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    
    public StudentRegistration()
    {
        JPanel p = new JPanel();
        
        p.add(lblStudentID = new JLabel ("Student ID"));
        p.add(txtStudentID = new JTextField (10)); 
        
        p.add(lblLastname = new JLabel ("Last Name"));
        p.add(txtLastname = new JTextField (10));     
        
        p.add(lblFirstname = new JLabel ("First Name"));
        p.add(txtFirstname = new JTextField (10));      
        
        p.add(lblAddress = new JLabel ("Address"));
        p.add(txtAddress = new JTextField (10));      
        
        p.add(lblCity = new JLabel ("City"));
        p.add(txtCity = new JTextField (10));      
        
        p.add(lblState = new JLabel ("State"));
        p.add(txtState = new JTextField (10));       
        
        p.add(lblZipcode = new JLabel ("Zip Code"));
        p.add(txtZipcode = new JTextField (10));
        
       
        
        p.add(btnSubmit = new JButton ("Submit"));
        p.add(btnInsert = new JButton ("Insert"));
        
        p.add(btnUpdate = new JButton ("Update"));
        p.add(btnDelete = new JButton ("Delete"));
       
                
        
        add(p);
        
        
        btnInsert.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    System.out.println("Driver connected");
                    
                    String url = "jdbc:ucanaccess://E:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Week 10\\Code\\Studentsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String StudentID = txtStudentID.getText();
                    
                    String Query = "Select * from StudentCourses where StudentID='"+StudentID+"'";
                    
                    ResultSet rset = stmt.executeQuery(Query);
                    
                    System.out.println("StudentID" + "Lastname" + "Firstname" + "Address"  + "City" + "State" + "CourseID" + "CourseInfo");
                    
                    while(rset.next())
                    {
                        System.out.println(rset.getString("StudentID") + ": " + 
                                rset.getString("Lastname") + ": " + 
                                rset.getString("Firstname") + ": " + 
                                rset.getString("Address") + ": " + 
                                rset.getString("City") + ": " + 
                                rset.getString("State") + ": " + 
                                rset.getString("Zipcode") + ": " + 
                                rset.getString("CourseID") + ": " + 
                                rset.getString("CourseInfo"));
                    }
                    
                    
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
        }
        
        
    });
        
        btnUpdate.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    System.out.println("Driver connected");
                    
                    String url = "jdbc:ucanaccess://E:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Week 10\\Code\\Studentsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String StudentID = txtStudentID.getText();
                    String Lastname = txtLastname.getText();
                    
                    String Query = "update StudentCourses set lastname = '"+Lastname+"' where StudentID='"+StudentID+"'";
                    
                    stmt.execute(Query);
                    System.out.println("student lastname updated");
                    
                    System.out.println("StudentID" + "Lastname" + "Firstname" + "Address"  + "City" + "State" + "CourseID" + "CourseInfo");
                    
                    
                    
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }        }
                
                
        });
        
        btnDelete.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    System.out.println("Driver connected");
                    
                    String url = "jdbc:ucanaccess://E:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Week 10\\Code\\Studentsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String StudentID = txtStudentID.getText();
                    
                    String Query = "Delete from StudentCourses where StudentID='"+StudentID+"'";
                    
                    stmt.execute(Query);
                    System.out.println("student deleted");
                    
                  //  System.out.println("StudentID" + "Lastname" + "Firstname" + "Address"  + "City" + "State" + "CourseID" + "CourseInfo");
                    
                    
                    
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }        }
                
                
        });        
        
        
        
                }}

