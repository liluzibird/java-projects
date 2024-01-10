
package week.pkg2;


public class c3 extends c2
{
    int numQuestions, numMissed;
    double pointsEach;
    
    public c3(int questions, int missed)
    {
        System.out.println("This is the super class constructor from the c3 class");
        
        c3.super.getGrade();
        
        double numericScore;
        
        numQuestions = questions;
        
        numMissed = missed;
        
        pointsEach = 100.0 / questions;
        
        numericScore = 100.0 - (missed * pointsEach);
        
        setScore(numericScore);
        
    }
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    public int getNumMissed()
    {
        return numMissed;
    }
    
    public int numQuestions()
    {
        return numQuestions;
    }
    
    
}
