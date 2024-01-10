
package week.pkg2;


import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Grades
{
    private double score;
    double score1, score2;
    double sum, average;
    
    
    public void setScore(double s)
    {
        score = s;
    }
            
    public void setSum(double s1, double s2)
    {
        String input;
        input = JOptionPane.showInputDialog("Enter the 1st number: ");
        s1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the 2nd number: ");
        s2 = Double.parseDouble(input);
        sum = s1 + s2;
    }
    
    
    public void setAverage(double s1, double s2)
    {
        average = sum/2;
    }
    
    public double getSum()
    {
        return sum;
    }

    public double getAverage()
    {
        return average;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade()
    {
        char letterGrade;

        if (score >= 90)
        {
            letterGrade = 'A';
        }
        else if(score >= 80)
        {
            letterGrade = 'B';
        }
        else if(score >= 70)
        {
            letterGrade = 'C';
        }
        else if(score >= 60)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }
        return letterGrade;
}

}