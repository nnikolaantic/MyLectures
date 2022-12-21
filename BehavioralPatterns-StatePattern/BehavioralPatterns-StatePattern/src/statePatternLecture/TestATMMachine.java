/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statePatternLecture;

/**
 *
 * @author anticn
 */
public class TestATMMachine {
	
	public static void main(String[] args){
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2000);
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
	}	
}