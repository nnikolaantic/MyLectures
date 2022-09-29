/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GettersAndSetters;

/**
 *
 * @author Anta
 */
public class ClassExample {
    private String argument1;
    private String argument2;
    private String argument3;
    private String argument4;

    public ClassExample(String argument1, String argument2, String argument3, String argument4) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
        this.argument4 = argument4;
    }

    public ClassExample() {
    }
    
    public String getArgument1() {
        return argument1;
    }

    public void setArgument1(String argument1) {
        this.argument1 = argument1;
    }

    public String getArgument2() {
        return argument2;
    }

    public void setArgument2(String argument2) {
        this.argument2 = argument2;
    }

    public String getArgument3() {
        return argument3;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }

    public String getArgument4() {
        return argument4;
    }

    public void setArgument4(String argument4) {
        this.argument4 = argument4;
    }
    
    
}
