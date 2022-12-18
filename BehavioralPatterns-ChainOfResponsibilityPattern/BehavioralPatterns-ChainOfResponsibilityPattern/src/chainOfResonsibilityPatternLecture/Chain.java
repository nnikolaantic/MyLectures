/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResonsibilityPatternLecture;

/**
 *
 * @author anticn
 */
// The chain of responsibility pattern has a 
// group of objects that are expected to between
// them be able to solve a problem. 
// If the first Object can't solve it, it passes
// the data to the next Object in the chain

public interface Chain {

	// Defines the next Object to receive the data
	// if this Object can't process it
	
	public void setNextChain(Chain nextChain);
	
	// Either solves the problem or passes the data
	// to the next Object in the chain
	
	public void calculate(Numbers request);
	
}