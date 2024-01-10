
package week.pkg2;


public class c2 {

    double score;
    
    public void setScore(double s) // create method called setScore
    {
        score = s;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public char getGrade()
    {
        char letterGrade = 0;
        if (score >= 100)
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
        else if(score <60)
        {
            letterGrade = 'F';
        }
        else
        {
            
        }
    
    public c2() //Constructor
    {
        //init all of the objects
        System.out.println("This is the super class constructor from the c2 class");
    }
            
}
