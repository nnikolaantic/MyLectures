/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandPatternLecture;

/**
 *
 * @author anticn
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    // Ovde koristimo interface recivera da bi mogli da upottrebimo polimorfizam i executujemo komandu nad objektima koji se srodni sa tim interfejsom
    public TurnTVOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}
