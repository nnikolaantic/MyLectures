/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternExample;

/**
 *
 * @author anticn
 */
class Runway implements Command{
    //Mediator
    private IATC atcMediator;
    
    //Postavljamo medijatora za Runaway klasu preko konsturktora
    public Runway(IATC atcMediator){
        this.atcMediator = atcMediator;
    }
    
    @Override
    public void land() {
        if (atcMediator.isAvailability()) {
            System.out.println("Runaway is available for landing");
        }else{
            System.out.println("Runway is not free pleas wait");
        }
    }
    
}
