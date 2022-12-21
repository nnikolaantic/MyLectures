/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statePatternPractice;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/abX4xzaAsoc
     */
    public static void main(String[] args) {

        Phone phone = new Phone();
        simulatePhoneClicks(phone);

    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }

}