/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m14;

/**
 *
 * @author User
 */
public class rectangle {
    
    double length, width;
    
    public rectangle()
    {
        length = 0.00;
        width = 0.00;
    }
    
    public rectangle (double l, double w)
    {
        length = l;
        width = w;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public void set (double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
    
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}
