/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResonsibilityPatternLecture;

/**
 *
 * @author anticn
 */
public class AddNumbers implements Chain {

    private Chain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()
    public void calculate(Numbers request) {

        if (request.getCalcWanted() == "add") {
            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "
                    + (request.getNumber1() + request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
