/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternExample;

/**
 *
 * @author anticn
 */
public class ATC implements IATC{
    private Runway runway;
    private Flight flight;
    public Boolean available = true;

    @Override
    public void registerFligth(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailabilityStatus(Boolean status) {
        this.available = status;
    }

    @Override
    public Boolean isAvailability() {
        return available;
    }
    
}
