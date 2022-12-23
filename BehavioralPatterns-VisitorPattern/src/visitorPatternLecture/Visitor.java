/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorPatternLecture;

/**
 *
 * @author anticn
 */
// The visitor pattern is used when you have to perform
// the same action on many objects of different types
public interface Visitor {

    // Created to automatically use the right 
    // code based on the Object sent
    // Method Overloading
    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);

}
