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
public class Test {
    public static void main(String[] args) {
        GammingMouse gm = new GammingMouse();
        gm.leftClick();
        gm.rightClick();
        gm.scrollUp();
        gm.scrollDown();
        gm.rgbLights("red");
        gm.turnOnRgb();
        
        System.out.println("");
        System.out.println("-------------------------------");
        
        OfficeMouse om = new OfficeMouse();
        om.leftClick();
        om.rightClick();
        om.scrollUp();
        om.scrollDown();
        om.connected();
        om.connect();
        om.connected();
        om.officeMouseColor();
        
        System.out.println("");
        System.out.println("-------------------------------");
        
        WerticalGripMouse wgm = new WerticalGripMouse();
        wgm.leftClick();
        wgm.rightClick();
        wgm.scrollUp();
        wgm.scrollDown();
        
    }
}
