package cmpr113.week1;


public class WK02Class03
{
    public static void main(String[] args)
    {
        String fullname = "Cynthia Susan Lee";
        
        String middlename = fullname.substring(8,13);
        
        String lastname = fullname.substring(14);
        
        System.out.println("The fullname is " + fullname);
        
        System.out.println("The middlename is " + middlename);
        
        System.out.println("The lastname is " + lastname);
        

    }
}
