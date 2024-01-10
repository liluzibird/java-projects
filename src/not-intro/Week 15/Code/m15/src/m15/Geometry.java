/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15;

class Geometry {
    private static double base, height, radius, length, width;
    public static double circArea(double r){
        radius = r;
        return Math.PI*Math.pow(radius, 2);
    }
    public static double rectArea(double l, double w){
        length=l;
        width=w;
        return length*width;
    }
    public static double triArea(double b, double h){
        base=b;
        height=h;
        return base*height*.5;
    }
}