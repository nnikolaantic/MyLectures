/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgePatternLecture;

/**
 *
 * @author anticn
 */
// Refined Abstraction
// If I decide I want to further extend the remote I can
public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }

}
