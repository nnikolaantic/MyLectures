/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandPatternLecture;

/**
 *
 * @author anticn
 */
// Each command you want to issue will implement 
// the Command interface
// INTERFACE FOR COMMANDS
public interface Command {
	
	public void execute();
	
	// You may want to offer the option to undo a command
	
	public void undo();
	
}