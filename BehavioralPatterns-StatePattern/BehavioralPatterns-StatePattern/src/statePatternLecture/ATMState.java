/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statePatternLecture;

/**
 *
 * @author anticn
 */
public interface ATMState {
	
	// Different states expected
	// HasCard, NoCard, HasPin, NoCash
	
	void insertCard();
	
	void ejectCard();
	
	void insertPin(int pinEntered);
	
	void requestCash(int cashToWithdraw);
	
}