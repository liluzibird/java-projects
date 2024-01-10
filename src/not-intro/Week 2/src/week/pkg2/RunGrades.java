
package week.pkg2;


import javax.swing.JOptionPane;
public class RunGrades extends Grades
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String input;
        double testScore;
        
        Grades var = new Grades();
        
        input = JOptionPane.showInputDialog("Enter a score between 0-100 ");
        testScore = Double.parseDouble(input);
        
        var.setScore(testScore);
        var.setSum(0, 0);
        var.setAverage(0, 0);
        
        //JOptionPane.showMessageDialog(null, "s1, s2: " + s1 + s2);
        JOptionPane.showMessageDialog(null, "The grade is " + var.getGrade());
        JOptionPane.showMessageDialog(null, "The sum is " + var.getSum());
        JOptionPane.showMessageDialog(null, "The average is " + var.getAverage());

    }

}

