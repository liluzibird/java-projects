import javax.swing.JOptionPane;

public class Project8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	//variables
    	int t1, t2, t3, avg;
    	String input;
    	
    	input =JOptionPane.showInputDialog("Enter the First Test Score: ");
    	t1 = Integer.parseInt(input);
    	
    	input =JOptionPane.showInputDialog("Enter the Second Test Score: ");
    	t2 = Integer.parseInt(input);

    	input =JOptionPane.showInputDialog("Enter the Third Test Score: ");
    	t3 = Integer.parseInt(input);

    	
    	//calculations
    		avg= (t1 + t2 + t3) / 3;
    	//outputs
    		
    	JOptionPane.showMessageDialog(null, "Your First Test Score = " + t1);
    	JOptionPane.showMessageDialog(null, "Your Second Test Score = " + t2);
   		JOptionPane.showMessageDialog(null, "Your Third Test Score = " + t3);
   		JOptionPane.showMessageDialog(null, "Your Average Test Score = " + avg);
}
}