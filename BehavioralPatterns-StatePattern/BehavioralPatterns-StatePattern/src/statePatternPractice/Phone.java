/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statePatternPractice;

import statePatternPractice.state.OffState;
import statePatternPractice.state.State;

/**
 *
 * @author anticn
 */
public class Phone {

    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking phone and turning off the screen";
    }

    public String home() {
        return "Going to home-screen";
    }

    public String unlock() {
        return "Unlocking the phone to home";
    }

    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }

}