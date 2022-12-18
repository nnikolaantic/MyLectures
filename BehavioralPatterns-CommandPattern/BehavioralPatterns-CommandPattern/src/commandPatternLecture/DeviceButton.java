/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandPatternLecture;

/**
 *
 * @author anticn
 */
// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called
// The execute method for the Command interface then calls 
// the method assigned in the class that implements the
// Command interface
// INVOKER
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    // Now the remote can undo past commands
    public void pressUndo() {
        theCommand.undo();
    }

}
