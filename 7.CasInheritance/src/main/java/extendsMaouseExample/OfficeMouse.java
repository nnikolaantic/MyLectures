/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsMaouseExample;

/**
 *
 * @author Anta
 */
public class OfficeMouse extends MauseSuperClass{
    private String color = "black";
    private boolean bluetooth = false;
    
    public void officeMouseColor(){
        System.out.println("Office mause color is "  + color);
    }
    
    public void connect(){
        this.bluetooth = true;
    }
    
    public void disconnect(){
        this.bluetooth = false;
    }
    
    public void connected(){
        if(bluetooth){
            System.out.println("Mouse is connected");
        }else{
            System.out.println("Mouse is not connecetd");
        }
    }
}
