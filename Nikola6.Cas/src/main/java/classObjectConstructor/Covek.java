/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classObjectConstructor;

/**
 *
 * @author Anta
 */
public class Covek {
    //prvi korak Class
    public String ime;
    public String prezime;
    public int godine;
    public String mail;
    public char pol;
    public String zanimanje;
    //prvi korak Class

    //drugi korak
    public Covek() {
    }
    
    public Covek(String ime, String prezime, int godine, String mail, char pol, String zanimanje) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.mail = mail;
        this.pol = pol;
        this.zanimanje = zanimanje;
    }
    //drugi korak
    
//    cetvrti korak
//    Overide anotacija zanci da smo mi vec postojecu metodu prekucali 
//    i daje do znanja JVM da mi zelimo da koristimo bas nasu prekucanu metodu a ne njenu ugradjenu verziju
    @Override
    public String toString() {
        return "Ime coveka je : " + this.ime + "\nprezime coveka je : " + this.prezime 
                + "\ngodine : " + this.godine + "\nmail : " + this.mail + "\npol : " + this.pol;
    }
    
    public String posao(){
        return "Ja sam " + this.ime + " i radim kao " + this.zanimanje ;
    }
//    cetvrti korak
    
}
