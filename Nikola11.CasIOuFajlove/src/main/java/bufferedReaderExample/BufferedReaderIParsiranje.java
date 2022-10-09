/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReaderExample;

/**
 *
 * @author Anta
 */
public class BufferedReaderIParsiranje {
    public static void main(String[] args) {
        //Staticke metode mogu da se pozovu na nivou klase bez instanciranja objekta
//        BufferedReaderExample.ucitajBrojIIspisiKvadrat();
        BufferedReaderExample.ucitajIIspisiString();
        BufferedReaderExample.ucitajBrojIIspisiParnost();
        
//        Isto se moze raditi i sa build inovanim java kalsama ma da je to ne preporucljivo
        Integer i = new Integer(2);
        
//        Metode koje nisus staticke se mogu pozvati preko inicijalizovanih objekata klase u kojoj je metoda definisana
        BufferedReaderExample be = new BufferedReaderExample();
        be.ucitajBrojIIspisiKvadrat();
    }
}
