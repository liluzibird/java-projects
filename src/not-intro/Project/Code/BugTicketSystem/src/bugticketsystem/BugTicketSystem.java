package bugticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class BugTicketSystem extends Application {
    
    Statement stmt;
    Scene scene;
    Button btnSubmit, btnAdd, btnUpdate,btnDisplay;
    Label lblLogin, lblPassword,lblBugID,
            lblAuthorContactEmail,lblProduct,lblEnviorment,lblDescription,
            lblDate,lblStatus,lblPriority,lblSolution;
    TextField txtLogin, txtBugID,txtAuthorContactEmail,
            txtDate;
    TextArea txtDescription,txtSolution;
    PasswordField txtPassword;
    ComboBox cmbProduct, cmbEnviorment, cmbStatus,cmbPriority;
    
    TableView<BugTicket> BugTable= new TableView();
    Label lblBugTable;
    TableColumn<BugTicket,Integer> colBugID;
    TableColumn<BugTicket,String> colAuthorContactEmail,
        colProduct,colEnviorment,colDescription,colDate,colStatus,colPriority,colSolution;
    Button btnRefresh;
    
    ObservableList<BugTicket> data = FXCollections.observableArrayList();
    /* int not converted to Observable Integer Property????
    1,"FakerThanFake.notgmail.com","Java Project 1.0.2","Windows 10",
    "Tables", "11/28/2022","New","High","NULL")
    new Bugticket(2,"NoEmail@notGmail.com", "Python Project 2.1","Windows XP","Null Pointer",
            "10/22/2022", "Resolved", "Mid", "LINK") 
    */
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)  throws Exception
    
    {   
        lblLogin = new Label("Username");
        txtLogin = new TextField();
        
        lblPassword = new Label("Password");
        txtPassword = new PasswordField();
        
        btnSubmit = new Button("Submit");
        btnSubmit.setOnAction(btnSubmitEvent);
        
        HBox h1 = new HBox(10);
        h1.getChildren().addAll(lblLogin,txtLogin,lblPassword,txtPassword,btnSubmit);
        
        scene = new Scene(h1);
        
        primaryStage.setTitle("Bug Ticketing System Login");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setResizable(true);
        primaryStage.show();
        //primaryStage.setOnCloseRequest(EXIT_ON_CLOSE); //how do I close window after second panel pop up?
        
    }
    public void BugTicketSystemWindow() throws SQLException //second scene
    {
       Stage stage = new Stage();
       VBox vbox = new VBox();
       vbox.setPadding(new Insets(10)); //paddding
       vbox.setAlignment(Pos.CENTER_LEFT); //puts in center
       
       lblBugID = new Label("Bug ID");
       txtBugID = new TextField();
       
       lblAuthorContactEmail = new Label("Author Contact Email");
       txtAuthorContactEmail = new TextField();
       
       lblProduct = new Label("Product");
       cmbProduct = new ComboBox();
       cmbProduct.getItems().addAll("Java Project 1.0.2", "Python Project 2.1", "Android App 10.2.10", "Java Project 2.2.10");
               
       lblEnviorment = new Label("Enviorment");
       cmbEnviorment = new ComboBox();
       cmbEnviorment.getItems().addAll("Linux", "Windows 10", "Windows XP", "Linux Debian Distro 10.2.1");
       
       lblDescription = new Label("Description");
       txtDescription = new TextArea();
       
       lblDate = new Label("Date");
       txtDate = new TextField();
       
       lblStatus = new Label("Status");
       cmbStatus = new ComboBox();
       cmbStatus.getItems().addAll("New", "Open", "Assigned", "Resolved");
       
       lblPriority = new Label("Priority");
       cmbPriority = new ComboBox();
       cmbPriority.getItems().addAll("Low", "Mid", "High");
       
       lblSolution = new Label("Solution");
       txtSolution = new TextArea();
       
       btnAdd = new Button("Add Ticket");
       btnAdd.setOnAction(btnAddEvent);
       
       btnUpdate = new Button("Update Ticket");
       btnUpdate.setOnAction(btnUpdateEvent);
       
       btnDisplay = new Button("Display Tickets");
       btnDisplay.setOnAction(btnDisplayEvent);
       
       vbox.getChildren().addAll(lblBugID,txtBugID,lblAuthorContactEmail, txtAuthorContactEmail,
               lblProduct, cmbProduct, lblEnviorment,cmbEnviorment,lblDescription,txtDescription,
               lblDate, txtDate,lblStatus, cmbStatus,lblPriority,cmbPriority,
               btnAdd,btnUpdate,btnDisplay,lblSolution,txtSolution); 
              
       Scene scene = new Scene(vbox, 400,550);
       stage.setTitle("Bug Ticket Form");
       stage.setScene(scene);
       stage.sizeToScene();
       stage.setResizable(true);
       stage.show();
     
    }
    public void BugTicketTable() //third scene that displays ticket table
    {
        
        Stage stage = new Stage();
        Scene scene = new Scene(new Group());
        stage.setTitle("Bug Ticket System");
        stage.sizeToScene();
        stage.setResizable(true);
       
       lblBugTable = new Label("Bug Tickets");
       lblBugTable.setFont(new Font("Ariel", 18));
       BugTable.setEditable(true);
       
       colBugID = new TableColumn("BugID");
       colAuthorContactEmail = new TableColumn("Author Contact Email");
       colProduct =new TableColumn("Product");
       colEnviorment =new TableColumn("Enviorment");
       colDescription =new TableColumn("Description");
       colDate =new TableColumn("Date"); 
       colStatus =new TableColumn("Status");
       colPriority =new TableColumn("Priority");
       colSolution = new TableColumn("Solution");
       
                   colBugID.setCellValueFactory(new PropertyValueFactory<>("BugID"));
                   colAuthorContactEmail.setCellValueFactory(new PropertyValueFactory<>("Author Contact Email"));
                   colProduct.setCellValueFactory(new PropertyValueFactory<>("Product"));
                   colEnviorment.setCellValueFactory(new PropertyValueFactory<>("Enviorment"));
                   colDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
                   colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
                   colStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
                   colPriority.setCellValueFactory(new PropertyValueFactory<>("Priority"));
                   colSolution.setCellValueFactory(new PropertyValueFactory<>("Solution"));
       
       btnRefresh = new Button("Refresh");
       btnRefresh.setOnAction(btnRefreshEvent);
       
       BugTable.setItems(data);
       BugTable.getColumns().addAll(colBugID,
               colAuthorContactEmail,colProduct,colEnviorment,colDescription,
               colDate,colStatus,colPriority,colSolution);
       
       HBox hbox = new HBox(); //horizontal box //add a number???
       hbox.setSpacing(5);
       hbox.setPadding(new Insets(10));
       hbox.getChildren().addAll(lblBugTable,BugTable,btnRefresh);
       
       ((Group) scene.getRoot()).getChildren().addAll(hbox);
       
       stage.setScene(scene);
       stage.show(); 
    
    }
    public class BugTicket { //class to define data in table

       SimpleIntegerProperty BugID;
       SimpleStringProperty AuthorContactEmail;
       SimpleStringProperty Product;
       SimpleStringProperty Enviorment;
       SimpleStringProperty Description;
       SimpleStringProperty Date;
       SimpleStringProperty Status;
       SimpleStringProperty Priority;
       SimpleStringProperty Solution;
        //constructor
       public BugTicket(SimpleIntegerProperty BugID,SimpleStringProperty AuthorContactEmail, 
                SimpleStringProperty Product, SimpleStringProperty Enviorment, SimpleStringProperty Description,
                SimpleStringProperty Date, SimpleStringProperty Status, SimpleStringProperty Priority, SimpleStringProperty Solution) {
            this.BugID = BugID;
            this.AuthorContactEmail = AuthorContactEmail;
            this.Product = Product;
            this.Enviorment = Enviorment;
            this.Description = Description;
            this.Date = Date;
            this.Status = Status;
            this.Priority = Priority;
        }
        public SimpleIntegerProperty getBugID() {
            return BugID;
        }

        public void setBugID(SimpleIntegerProperty BugID) {
            this.BugID = BugID;
        }

        public SimpleStringProperty getAuthorContactEmail() {
            return AuthorContactEmail;
        }

        public void setAuthorContactEmail(SimpleStringProperty AuthorContactEmail) {
            this.AuthorContactEmail = AuthorContactEmail;
        }

        public SimpleStringProperty getProduct() {
            return Product;
        }

        public void setProduct(SimpleStringProperty Product) {
            this.Product = Product;
        }

        public SimpleStringProperty getEnviorment() {
            return Enviorment;
        }

        public void setEnviorment(SimpleStringProperty Enviorment) {
            this.Enviorment = Enviorment;
        }

        public SimpleStringProperty getDescription() {
            return Description;
        }

        public void setDescription(SimpleStringProperty Description) {
            this.Description = Description;
        }

        public SimpleStringProperty getDate() {
            return Date;
        }

        public void setDate(SimpleStringProperty Date) {
            this.Date = Date;
        }

        public SimpleStringProperty getStatus() {
            return Status;
        }

        public void setStatus(SimpleStringProperty Status) {
            this.Status = Status;
        }

        public SimpleStringProperty getPriority() {
            return Priority;
        }

        public void setPriority(SimpleStringProperty Priority) {
            this.Priority = Priority;
        }
        public SimpleStringProperty getSolution() {
            return Solution;
        }

        public void setSolution(SimpleStringProperty Solution) {
            this.Solution = Solution;
        }
 
    }// 
    EventHandler<ActionEvent>btnRefreshEvent = new EventHandler<ActionEvent>(){
    
      @Override
      public void handle(ActionEvent e) 
      {
        try {
           //add action!!!
           JOptionPane.showMessageDialog(null,"Bug Ticket System Refreshed");
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString() );
        }
        
      }
      
     };
    
     EventHandler<ActionEvent>btnAddEvent = new EventHandler<ActionEvent>(){
    
      public void handle(ActionEvent e) 
      {
        try {
            int BugID = Integer.parseInt(txtBugID.getText());
            String ACE = txtAuthorContactEmail.getText();
            
            String descript = txtDescription.getText(); 
            String date = txtDate.getText();
            String Sol = txtSolution.getText();
            
            String stringQuery1 = "insert into BUGTICKET(BUGID,AUTHORCONTACTEMAIL,"
                    + "PRODUCT,ENVIORMENT,DESCRIPTION,"
                    + "DATEREPORTED,STATUS,PRIORITY,SOLUTION)values"
                    + "("+BugID+","
                    +"'"+ACE+"',"
                    +"'"+cmbProduct.getValue()+"',"
                    +"'"+cmbEnviorment.getValue()+"',"
                    + "'"+descript+"',"
                    +"'"+date+"',"
                    +"'"+cmbStatus.getValue()+"',"
                    +"'"+cmbPriority.getValue()+"',"
                    +"'"+Sol+"')";
            stmt.execute(stringQuery1);     
            JOptionPane.showMessageDialog(null,"Ticket Added");       
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString() );
        }
        
      }
      
     };
      EventHandler<ActionEvent>btnUpdateEvent = new EventHandler<ActionEvent>(){
    
      @Override
      public void handle(ActionEvent e) 
      {
       try{ 
            int BugID = Integer.parseInt(txtBugID.getText());
            String ACE = txtAuthorContactEmail.getText();
            
            String descript = txtDescription.getText(); 
            String date = txtDate.getText();
            String Sol = txtSolution.getText();
            
           
            String stringQuery6 = "Update BUGTICKET set AUTHORCONTACTEMAIL = '"+ACE+"'"
                    + "WHERE BUGID = "+BugID+"";
            String stringQuery7 = "Update BUGTICKET set PRODUCT = '"+cmbProduct.getValue()+"'"
                     +"WHERE BUGID = "+BugID+""; 
            String stringQuery8 = "Update BUGTICKET set ENVIORMENT = '"+cmbEnviorment.getValue()+"'"
                     +"WHERE BUGID = "+BugID+""; 
            String stringQuery9 = "Update BUGTICKET set DESCRIPTION = '"+descript+"'"
                    + "WHERE BUGID = "+BugID+""; 
            String stringQuery10 = "Update BUGTICKET set DATEREPORTED = '"+date+"'"
                    + "WHERE BUGID = "+BugID+""; 
            String stringQuery11 = "Update BUGTICKET set STATUS = '"+cmbStatus.getValue()+"'"
                     +"WHERE BUGID = "+BugID+""; 
            String stringQuery12 = "Update BUGTICKET set PRIORITY = '"+cmbPriority.getValue()+"'"
                     +"WHERE BUGID = "+BugID+""; 
            String stringQuery13 = "Update BUGTICKET set SOLUTION = '"+Sol+"'"
                    + "WHERE BUGID = "+BugID+" "; 
            
          stmt.execute(stringQuery6);
          stmt.execute(stringQuery7);
          stmt.execute(stringQuery8);
          stmt.execute(stringQuery9);
          stmt.execute(stringQuery10);
          stmt.execute(stringQuery11);
          stmt.execute(stringQuery12);
          stmt.execute(stringQuery13);
          
          JOptionPane.showMessageDialog(null,"Ticket has been Updated"); 
          
      }catch(Exception ex)
      {
          JOptionPane.showMessageDialog(null, ex.toString());
      } 
      }
      
     };
       
       EventHandler<ActionEvent>btnDisplayEvent = new EventHandler<ActionEvent>(){
    
      @Override
      public void handle(ActionEvent e) 
      {
        try {
           BugTicketTable(); //call the table?//how can I view it?
           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString() );
        }
        
      }
      
     };
    EventHandler<ActionEvent>btnSubmitEvent = new EventHandler<ActionEvent>(){
    
      @Override
      public void handle(ActionEvent e) 
      {
          //this is where the action code goes
         try{
              
          Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
              System.out.println("Driver Connected");
              
          String url = "jdbc:derby://localhost:1527/BugTicketSystemDB;create=true;user=root;password=sac123"; //points to db
          
          //following connects to it
          Connection connection = DriverManager.getConnection(url);
          System.out.println("Database connected");
          
          stmt =connection.createStatement(); //allows for sql statements
          
          String queryString = "Select * from Login where username = '"+txtLogin.getText()+"' and Password = '"+txtPassword.getText()+"'";      
          ResultSet rset = stmt.executeQuery(queryString);
          
          if(rset.next())
          {
              JOptionPane.showMessageDialog(null,"Welcome " + txtLogin.getText());
              BugTicketSystemWindow(); //calls the bug ticket system  method that has second scene
              rset.close();
          }
          else
          {
              JOptionPane.showMessageDialog(null,"Username or Password is not correct");
          }   
         }catch(Exception ex)
         {
             System.out.println(ex.toString());
         }

      }
};
            
            }