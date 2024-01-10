/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class loginApp extends Application {
    
    Stage window;
    Scene scene;
    Button btnSubmit, btnClear;
    Label lblLogin, lblPassword;
    TextField txtLogin, txtPassword;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception
    {
        lblLogin = new Label ("Enter username");
        txtLogin = new TextField();
        
        lblPassword = new Label ("Enter password");
        txtPassword = new TextField();
        
        btnSubmit = new Button ("Submit");
        btnSubmit.setOnAction(btnSubmitEvent);
        
        btnClear = new Button ("Clear");
        btnClear.setOnAction(btnClearEvent);
     
        HBox h1 = new HBox(10);
        
        h1.getChildren().addAll(lblLogin, txtLogin, lblPassword, txtPassword, btnSubmit, btnClear);
        scene = new Scene(h1);
        
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public void MainPage()
    {
        Stage stage = new Stage();
        
        VBox box = new VBox();
        box.setPadding(new Insets(10));
        
        box.setAlignment(Pos.CENTER);
        
        Label lblLastname = new Label("Lastname");
        TextField txtLastname = new TextField();
        
        Label lblFirstname = new Label("Firstname");
        txtFirstname = new TextField();
        
        Button btnTransfer = new Button("Transfer");
        btnTransfer.setScaleX(2);
        btnTransfer.setScaleY(1);
        btnTransfer.setOnAction(btnTransferEvent);
        
        box.getChildren().add(lblLastname);
        box.getChildren().add(txtLastname);
        
        box.getChildren().add(lblFirstname);
        box.getChildren().add(txtFirstname);
        
        box.getChildren().add(btnTransfer);
        
        Scene scene = new Scene(box, 250, 150);
        stage.setScene(scene);
        stage.show();
    }
    
EventHandler<ActionEvent> btnTransferEvent = new EventHandler<ActionEvent> (){
        public void handle (ActionEvent e)
        {
            String LN = txtLastname.getText();
            String FN = txtFirstname.getText();
        
            JOptionPane.showMessageDialog(null, "confirmation: \n" + "\n" + LN + "\n" + FN);
        }
    };
private Statement stmt;

EventHandler<ActionEvent> btnSubmitEvent = new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e)
        {
        try
        {
        Class.forName("org.apache.derby.jdbcClientDriver").newInstance();
            System.out.println("Driver connected");
            String url = "jdbc:derby://localhost:1527/loginApp;create = true; user = root; password = sac123";
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Database connected");
            stmt = connection.createStatement();
            
                String u = txtLogin.getText();
                String p = txtPassword.getText();
                
                String queryString = "select * from LoginsTable where ID ='" + u + "' and password='" + p + "'";
                    ResultSet rset = stmt.executeQuery(queryString);
                    
                    if(rset.next())
                    {
                        JOptionPane.showMessageDialog(null, "Hello " + u);
                        MainPage();
                        
                        rset.close();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "ID or password is not correct");
                        txtLogin.setText("");
                        txtPassword.setText("");
                    }
        }
        catch (Exception ex){
        }
        }
};

    EventHandler<ActionEvent> btnClearEvent = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e)
            {
                txtLogin.setText("");
                txtPassword.setText("");
            }
    };
    
}