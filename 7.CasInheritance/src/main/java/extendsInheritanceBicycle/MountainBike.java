/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsInheritanceBicycle;

/**
 *
 * @author Anta
 */
public class MountainBike extends Bicycle{
    // the MountainBike subclass adds one more field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight){
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
 
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString(){
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
