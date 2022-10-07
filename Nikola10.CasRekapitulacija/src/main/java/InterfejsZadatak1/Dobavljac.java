/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfejsZadatak1;

/**
 *
 * @author Anta
 */
public class Dobavljac {
    //Ovako napisana metoda izvrsiIsporuku omogucava klasi Dobavljac 
    //da vrsi isporuku bilo kakvoj prodavnici tj. skladistu. Jedino je 
    //bitno da ta prodavnica tj. klasa kojom se predstavlja implementira 
    //interfejs SluzbaNabavke. 
    public void izvrsiIsporuku(SluzbaNabavke n, int kolicina){ 
        n.dodajRobu(kolicina); 
    }
}
