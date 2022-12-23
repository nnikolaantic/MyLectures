/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgePatternLecture;

/**
 *
 * @author anticn
 */
// Concrete Implementor
// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices
public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }

}
