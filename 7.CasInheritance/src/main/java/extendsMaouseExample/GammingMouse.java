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
public class GammingMouse extends MauseSuperClass{
    private String rgbColor;
    
    public void rgbLights(String color){
        this.rgbColor = color;
    }
    
    public void turnOnRgb(){
        if(rgbColor != null){
            System.out.println("RGB turned on with color " + rgbColor);
        }else{
            rgbColor = "white";
            System.out.println("RGB turned on with color " + rgbColor);
        }
    }
    
    public void gammingButton(){
        System.out.println("Gamming button clicked");
    }
}
