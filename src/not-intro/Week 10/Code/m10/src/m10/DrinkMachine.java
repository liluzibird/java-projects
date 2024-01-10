/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 *
 * @author Zachary Murphy
 */
public class DrinkMachine extends JApplet {

 private JPanel sodaOptions; // to hold the selectrion of sodea buttons
 private JPanel main; //whole panel
 private JTextField tendered; //amount of money put in 
 private JTextField orderTotal; //total of order, possibly use for calcs
 private JTextField change; //change dispensed 
 private JTextField status; //if empty or not enough tendered 
 private JButton cola; //button
 private JButton lemonLime;//button
 private JButton grape;//button
 private JButton rootBeer;//button
 private JButton bWater;//button
 private ImageIcon colaIcon;//button
 double test;
 
 
 //default available cans for each item in machine will be reduces as selected.
 int avCola = 20; 
 int avLemonLime = 20;
 int avGrape = 20;
 int avRb = 20;
 int avBWater = 20;
 
double inputMoney = 0.0; //money that user puts in
 double changeGiven = 0.0; //amount of change given
 double totalFunds = 0.0; //total funds, might use this
 
 //main method in applet
    public void init() {
        this.setSize(400,300); //size of JApplet
       buildSodaOptionsPanel(); //adding panel
         
       buildPanel(); //adding panel
 
        mainPanel(); //adding panel


    }

    // TODO overwrite start(), stop() and destroy() methods
    


/*
    The buildSodaOptionsPanel () method creates all items used in the sodaOptions JPanel
    Also will implement action listeners for each button.
    */
private void buildSodaOptionsPanel(){
    //declare panel
    sodaOptions = new JPanel(new FlowLayout(FlowLayout.TRAILING));
    sodaOptions.setLayout(new GridLayout(6,0));
    
//making new label to give instructions
    JLabel sodaMessage = new JLabel ("Select from: ");
    

 
    
//create radio buttons
    cola = new JButton("Cola");
    lemonLime = new JButton("Lemon Lime");
     grape = new JButton ("Grape Sode");
     rootBeer = new JButton ("Root beer");
     bWater = new JButton ("Bottled Water");
  
    
    //add everything
    cola.addActionListener(new ColaListener());
    sodaOptions.add(sodaMessage);
    sodaOptions.add(cola);
    lemonLime.addActionListener(new LemonListener());
    sodaOptions.add(lemonLime);
    grape.addActionListener(new GrapeListener());
    sodaOptions.add(grape);
    rootBeer.addActionListener(new RBListener());
    sodaOptions.add(rootBeer);
    bWater.addActionListener(new BWaterListener());
    sodaOptions.add(bWater);
    
}
/*
buildPanel() will hold the users tendered cash and status if item is out of stock
or not enough funds are tendered
*/
private void buildPanel(){
    main = new JPanel(new FlowLayout(FlowLayout.LEFT));
        main.setLayout(new GridLayout(0,1));

    JLabel inputMessage = new JLabel("Enter the amount tendered.");
    tendered = new JTextField(15);
    
    main.add(inputMessage);
    main.add(tendered);
    
    



    JLabel changeLabel = new JLabel("Change: ");
    change = new JTextField(10);
    change.setEditable(false);
    JLabel statusLabel = new JLabel("In Stock?: ");
    status =  new JTextField(15);
    status.setEditable(false);
     orderTotal = new JTextField(10);
    orderTotal.setEditable(false);
    
    //output.setLayout( new FlowLayout(FlowLayout.TRAILING));
    
    
    main.add(changeLabel);
    main.add(change);
    main.add(statusLabel);
    main.add(status);

}

/*
mainPanel() will hold the panels that go into the whole program and will 
locate them.
*/
 private void mainPanel(){
     buildSodaOptionsPanel();
     buildPanel();
        add(main,BorderLayout.WEST);
        add(sodaOptions,BorderLayout.EAST);
     
 }

   

/*
 LemonListener is actionlistener if LemonLime is selected
 */
private class LemonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            inputMoney = Double.parseDouble(tendered.getText());
            test = inputMoney;
            if(test < .75){
                change.setText("ERROR: Please try again.");
                status.setText("Please put in 0.75.");
            }
            if (avLemonLime > 0 ){
            orderTotal.setText("$0.75");
            avLemonLime = avLemonLime - 1;

            changeGiven = inputMoney - 0.75;
            change.setText(String.valueOf(changeGiven));
            status.setText("");
            }else{
                status.setText("Sorry that item is out of stock!");
            }   
        }
    
}

/*
GrapeListener is actionlistener is Grape is selected.
*/
private class GrapeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            inputMoney = Double.parseDouble(tendered.getText());
            test = inputMoney;
            if(test <.75){
               change.setText("ERROR: Please try again.");

                status.setText("Please put in 0.75.");

            }
               if (avGrape >0 ){
            orderTotal.setText("$0.75");
            avGrape = avGrape - 1;
            inputMoney = Double.parseDouble(tendered.getText());
            changeGiven = inputMoney - 0.75;
            change.setText(String.valueOf(changeGiven));
            status.setText("");
            }else{
                status.setText("Sorry that item is out of stock!");
                change.setText("0.00");
            }
        }
    
}

/*
BWaterListener is action listener is bwater is selected.
*/

private class BWaterListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            inputMoney = Double.parseDouble(tendered.getText());
            test = inputMoney;
            if(test <.75){
                change.setText("ERROR: Please try again.");
                status.setText("Please put in 0.75.");

            }
                if (avBWater >0 ){
            orderTotal.setText("$0.75");
            avBWater = avBWater - 1;
            inputMoney = Double.parseDouble(tendered.getText());
            changeGiven = inputMoney - 0.75;
            change.setText(String.valueOf(changeGiven));
            status.setText("");
            }else{
                status.setText("Sorry that item is out of stock!");
                change.setText("0.00");
            }
        }
    
}

/*
Cola listener is action listener if cola is selected. 
*/
private class ColaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            inputMoney = Double.parseDouble(tendered.getText());
            test = inputMoney;
            if(test <.75){
                change.setText("ERROR: Please try again.");
                status.setText("Please put in 0.75.");

            }
                if (avCola >0 ){
            orderTotal.setText("$0.75");
            avCola = avCola - 1;
            inputMoney = Double.parseDouble(tendered.getText());
            changeGiven = inputMoney - 0.75;
            change.setText(String.valueOf(changeGiven));
            status.setText("");
            }else{
                status.setText("Sorry that item is out of stock!");
                change.setText("0.00");
            }
        }
    
}

/*
RBListener is action listener if RB is selected.
*/

private class RBListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
                inputMoney = Double.parseDouble(tendered.getText());
                test = inputMoney;
                
            if(test <0.75){
                change.setText("ERROR: Please try again.");
                status.setText("Please put in 0.75.");
                
            }
            if (avRb >0 ){
            orderTotal.setText("$0.75");
            avRb = avRb - 1;
            inputMoney = Double.parseDouble(tendered.getText());
            changeGiven = inputMoney - 0.75;
            change.setText(String.valueOf(changeGiven));
            status.setText("");
            }else{
                status.setText("Sorry that item is out of stock!");
                change.setText("0.00");
            }
            

            
            
        }
    
}


}