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
public class WerticalGripMouse extends MauseSuperClass{

    @Override
    public void leftClick() {
        System.out.println("Vertical left click");
    }

    @Override
    public void rightClick() {
        System.out.println("Vertical right click");
    }
    
    
}
