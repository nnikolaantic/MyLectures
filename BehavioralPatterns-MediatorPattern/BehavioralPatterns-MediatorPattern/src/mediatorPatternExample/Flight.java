/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternExample;

/**
 *
 * @author anticn
 */
class Flight implements Command{
    //Mediator
    private IATC atcMediator;
    
    //Postavljamo medijatora za Runaway klasu preko konsturktora
    public Flight(IATC atcMediator){
        this.atcMediator = atcMediator;
    }
    
    @Override
    public void land() {
        if(atcMediator.isAvailability()){
            System.out.println("Landed successfully");
            atcMediator.setAvailabilityStatus(false);
        }else{
            System.out.println("Wwaiting for runaway");
        }
    }
    
    public void readyToLand(){
        System.out.println("Landing initated!");
    }
    
    public void parked(){
        System.out.println("Flight is parked");
        atcMediator.setAvailabilityStatus(true);
    }
    
}
