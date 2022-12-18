/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypePatternLecture;

/**
 *
 * @author anticn
 */
// By making this class cloneable you are telling Java
// that it is ok to copy instances of this class
// These instance copies have different results when
// System.identityHashCode(System.identityHashCode(bike))
// is called IT CREATES DIFFERENT INSTANCES IN MEMORY not references

public interface Animal extends Cloneable {
	
	public Animal makeCopy();
	
}