/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15;

class RoomDimension {
    private double length, width;
    public RoomDimension(double l, double w) {
        length = l;
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public RoomDimension(RoomDimension object2){
        length = object2.length;
        width = object2.width;
    }

}