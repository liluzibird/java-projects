
package week.pkg2;


public class Questions extends RunGrades
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public Questions(int q, int m)
    {
        double numericScore;
        numQuestions = q;
        numMissed = m;
        
        pointsEach = 100.0/q;
        numericScore = 100.0 - (m * pointsEach);
        
        setScore(numericScore);
    }
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    public double getNumMissed()
    {
        return numMissed;
    }
    
}
