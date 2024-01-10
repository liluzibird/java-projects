/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdeskticketapplication;


import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author User
 */
public class helpdeskticketapplication extends JFrame {
    Statement stmt;
    
    JLabel lblTicketID, lblLastname, lblFirstname, lblIssue, lblDevice;
    JTextField txtTicketID, txtLastname, txtFirstname, txtIssue, txtDevice;
    JButton btnSubmit, btnInsert, btnUpdate, btnDelete;
    
    
    public static void main(String[] args) {
        JFrame frame = new helpdeskticketapplication();
        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    
    public helpdeskticketapplication()
    {
        JPanel p = new JPanel();
        
        p.add(lblTicketID = new JLabel ("Ticket ID"));
        p.add(txtTicketID = new JTextField (10)); 
        
        p.add(lblLastname = new JLabel ("Last Name"));
        p.add(txtLastname = new JTextField (10));     
        
        p.add(lblFirstname = new JLabel ("First Name"));
        p.add(txtFirstname = new JTextField (10));      
        
        p.add(lblIssue = new JLabel ("Issue"));
        p.add(txtIssue = new JTextField (10));      
        
        p.add(lblDevice = new JLabel ("Device"));
        p.add(txtDevice = new JTextField (10));      
        
       
        
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
                    
                    String url = "jdbc:ucanaccess://D:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Project\\Code\\Ticketsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String TicketID = txtTicketID.getText();
                    
                    String Query = "Select * from TicketIssues where TicketID='"+TicketID+"'";
                    
                    ResultSet rset = stmt.executeQuery(Query);
                    
                    System.out.println("TicketID" + "Lastname" + "Firstname" + "Issue"  + "Device" + "State" + "CourseID" + "CourseInfo");
                    
                    while(rset.next())
                    {
                        System.out.println(rset.getString("TicketID") + ": " + 
                                rset.getString("Lastname") + ": " + 
                                rset.getString("Firstname") + ": " + 
                                rset.getString("Issue") + ": " + 
                                rset.getString("Device") + ": " + 
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
                    
                    String url = "jdbc:ucanaccess://D:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Project\\Code\\Ticketsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String TicketID = txtTicketID.getText();
                    String Lastname = txtLastname.getText();
                    
                    String Query = "update TicketIssues set lastname = '"+Lastname+"' where TicketID='"+TicketID+"'";
                    
                    stmt.execute(Query);
                    System.out.println("ticket lastname updated");
                    
                    System.out.println("TicketID" + "Lastname" + "Firstname" + "Issue"  + "Device" + "State" + "CourseID" + "CourseInfo");
                    
                    
                    
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
                    
                    String url = "jdbc:ucanaccess://D:\\Skool\\SAC\\FALL 2022\\CMPR 113\\Project\\Code\\Ticketsdb.accdb";
                    
                    Connection connect = DriverManager.getConnection(url);
                    
                    stmt = connect.createStatement();
                    
                    System.out.println("Database connected");
                    
                    String TicketID = txtTicketID.getText();
                    
                    String Query = "Delete from TicketIssues where TicketID='"+TicketID+"'";
                    
                    stmt.execute(Query);
                    System.out.println("ticket deleted");
                    
                    
                    
                    
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }        }
                
                
        });        
        
        
        
                }}

