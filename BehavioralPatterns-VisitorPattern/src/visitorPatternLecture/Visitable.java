/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorPatternLecture;

/**
 *
 * @author anticn
 */
public interface Visitable {

    // Allows the Visitor to pass the object so
    // the right operations occur on the right 
    // type of object.
    // accept() is passed the same visitor object
    // but then the method visit() is called using 
    // the visitor object. The right version of visit()
    // is called because of method overloading
    public double accept(Visitor visitor);

}
