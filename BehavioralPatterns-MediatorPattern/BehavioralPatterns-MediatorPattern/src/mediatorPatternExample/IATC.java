/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternExample;

/**
 *
 * @author anticn
 */
//Interface Air Traffic Controll
public interface IATC {
    
    public void registerFligth(Flight flight);
    public void registerRunway(Runway runway);
    public void setAvailabilityStatus(Boolean status);
    public Boolean isAvailability();
    
}
