/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAbstrakcijaJavaEnkapsulacija;

/**
 *
 * @author Anta
 */
public class ClassExample {
//    public String atribute1;
//    public String atribute2;
//    public String atribute3;
//    public String atribute4;
    private String atribute1;
    private String atribute2;
    private String atribute3;
    private String atribute4;

    public ClassExample() {
    }

    public ClassExample(String atribute1, String atribute2, String atribute3, String atribute4) {
        this.atribute1 = atribute1;
        this.atribute2 = atribute2;
        this.atribute3 = atribute3;
        this.atribute4 = atribute4;
    }

    
    //Read and write access combination
    public String getAtribute1() {
        return atribute1;
    }

    public void setAtribute1(String atribute1) {
        this.atribute1 = atribute1;
    }

    public String getAtribute2() {
        return atribute2;
    }

    public void setAtribute2(String atribute2) {
        this.atribute2 = atribute2;
    }

    public String getAtribute3() {
        return atribute3;
    }

    public void setAtribute3(String atribute3) {
        this.atribute3 = atribute3;
    }

    public String getAtribute4() {
        return atribute4;
    }

    public void setAtribute4(String atribute4) {
        this.atribute4 = atribute4;
    }
    
    
    
}
