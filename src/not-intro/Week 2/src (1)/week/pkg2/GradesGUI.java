
package week.pkg2;

import javax.swing.JOptionPane;


public class GradesGUI
{
    double score;
    
    public void settestScore(double s) // create method called settestScore
    {
        score = s;
    }
    
    public double gettestScore()
    {
        return score;
    }

    void setScore(double testScore)
    {
        testScore = score;
    }

    public char getGrade()
    {
        char letterGrade = 0;
        
        if (score > 100)
        {
            JOptionPane.showMessageDialog(null, "Cannot be greater than 100");
        }
        
        else if(score >= 90)
        {
            letterGrade = 'A';
        }
        
        else if (score >= 80)
        {
            letterGrade = 'B';
        }
        
        else if (score >= 70)
        {
            letterGrade = 'C';
        }
        
        else if (score >= 60)
        {
            letterGrade = 'D';
        }

        else
        {
            letterGrade = 'F';
        }
        
        return letterGrade;
    }
    public GradesGUI() //Constructor
    {
        //init all of the objects
        System.out.println("This is the super class constructor from the c2 class");
        
    }
    
}
