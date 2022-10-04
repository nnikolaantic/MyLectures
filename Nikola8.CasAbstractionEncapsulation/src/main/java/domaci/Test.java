/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        Vozilo[] nizVozila = new Vozilo[3];
        
        Auto auto = new Auto();
        Autobus autobus = new Autobus();
        Motor motor = new Motor();
        
        nizVozila[0] = auto;
        nizVozila[1] = autobus;
        nizVozila[2] = motor;
        
        ispisiVozila(nizVozila);
        
    }
    
    public static void ispisiVozila(Vozilo[] nizVozila){
        for(Vozilo vozilo : nizVozila){
            vozilo.uplaliVozilo();
        }
    }
}
