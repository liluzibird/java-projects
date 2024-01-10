package m11;

public class c2
{
    public static void main(String[] args)
    {
        double result = sum(10);
        
        System.out.println(result);
    }
    
    public static double sum(double k)
    {
        if (k > 0)
        {
            return k + sum(k - 1);
        }
        else
        {
            return 0;
        }
    }
}
