/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceZadatak;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        //Ovo je primer kako ista metoda moze da opsluzuje vise klasa ako 
        //se koriste interfejsi. Kada interfejsi ne bi bili korisceni, 
        //morale bi da se u okviru klase Dobavljac napisu dve metode 
        //izvrsiIsporuku koje bi, u sustini, radile isto samo bi jedna 
        //bila zaduzena za klasu Skladiste a druga za klasu Prodavnica. 
        Prodavnica p = new Prodavnica();

        Dobavljac d = new Dobavljac();
        Skladiste s = new Skladiste();

        p.ispisi();
         //Metodi izvrsiIsporuku se moze kao ulazni argument proslediti 
        //objekat klase Prodavnica jer ova klasa implementira interfejs 
        //SluzbaNabavke. Onda se u okviru metode izvrsiIsporuku preko 
        //interfejsa SluzbaNabavke poziva metoda dodajRobu klase Prodavnica. 

        d.izvrsiIsporuku(p,
                100);
        //Metodi izvrsiIsporuku se moze kao ulazni argument proslediti 
        //objekat klase Skladiste jer ova klasa implementira interfejs 
        //SluzbaNabavke. Onda se u okviru metode izvrsiIsporuku preko 
        //interfejsa SluzbaNabavke poziva metoda dodajRobu klase Skladiste. 
        d.izvrsiIsporuku(s, 500); p.ispisi();
    }
}
