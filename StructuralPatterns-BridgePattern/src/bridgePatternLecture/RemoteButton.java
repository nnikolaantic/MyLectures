/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgePatternLecture;

/**
 *
 * @author anticn
 */
// Abstraction
// This is an abstract class that will represent numerous
// ways to work with each device
public abstract class RemoteButton {

    // A reference to a generic device using aggregation
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice) {
        theDevice = newDevice;
    }

    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();

}
