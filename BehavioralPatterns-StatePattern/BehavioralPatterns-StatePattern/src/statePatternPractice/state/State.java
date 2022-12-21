/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statePatternPractice.state;

import statePatternPractice.Phone;

/**
 *
 * @author anticn
 */
public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();

}