/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternExample;

/**
 *
 * @author anticn
 */
public class DesignPatternTest {
    public static void main(String[] args) {
        IATC atcMediator = new ATC();
        
        Runway runway = new Runway(atcMediator);
        Flight flight1 = new Flight(atcMediator);
        
        //Sada moramo da napravimo komunikaciju izmedju Flight i Runway preko Medijatora
        atcMediator.registerFligth(flight1);
        atcMediator.registerRunway(runway);
        
        flight1.readyToLand();
        runway.land();
        flight1.land();
        
        Flight flight2 = new Flight(atcMediator);
        flight2.land();
        runway.land();
        
        flight1.parked();
        flight2.land();
        
    }
}
