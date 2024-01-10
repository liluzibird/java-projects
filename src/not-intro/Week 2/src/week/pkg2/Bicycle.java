
package week.pkg2;

import java.util.Scanner;


public class Bicycle
{
    public int gear;
    public int speed;
    
    public Bicycle(int gear, int speed)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speed: 3\nEnter speed: 100\nEnter seat height: 25");
        this.gear = gear;
        
        this.speed = speed;
    }
    
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    
    public void speedUp(int increment)
    {
        speed += increment;
    }
    
    public String toString()
    {
        return ("No of gears are " + gear
        + "\nspeed of bicycle is " + speed);
    }
}
