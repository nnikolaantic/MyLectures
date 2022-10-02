/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Anta
 */
public class OverloadClass {
    public int calculate(int a, int b){
        return a + b;
    }
    public int calculate(int a, int b , int c){
        return a + b + c;
    }
    public double calculate(double a, double b){
        return a + b;
    }
    
}
