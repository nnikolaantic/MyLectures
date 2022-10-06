/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjePrimer2;

/**
 *
 * @author Anta
 */
public class TestVozilo {

    public static void main(String[] args) {
        Vozilo v = new TrkackoVozilo();
        v.postaviNaziv("Audi S8 GT");
        //Ne moze se pozvati metoda
        //"postaviMaksimalnuBrzinu" jer je 
        //to metoda podklase TrkackoVozilo 
        //i ne postoji u nadklasi Vozilo. 
        //v.postaviMaksimalnuBrzinu(); 
        //Pozvace se metoda "ispisi" klase 
        //TrkackoVozilo, a ne metoda "ispisi" 
        //klase Vozilo. 
        v.ispisi();
        //Konvertovanje postojeceg objekta u 
        //klasu TrkackoVozilo. 
        TrkackoVozilo tv = (TrkackoVozilo) (v);
        //Tek se sada moze pozvati metoda 
        //postaviMaksimalnuBrzinu. 
        tv.postaviMaksimalnuBrzinu(350);
        tv.ispisi();
        
//        U okviru “main” metode klase TestVozilo se kreira 
//jedan objekat klase TrkackoVozilo ali se dodeljuje promenljivoj 
//tipa Vozilo. Ove dve klase su međusobno kompatibilne, 
//pa je ovakvo dodeljivanje dozvoljeno. Jedino 
//ograničenje koje se javlja je to da se sada objekat “gleda kroz 
//fokus klase Vozilo” pa se ne mogu pozivati metode koje ne
//pripadaju ovoj klasi. Prema tome, poziv metode
//“postaviMaksimalnuBrzinu” nije moguć. Tek kada se eksplicitno 
//izvrši konvertovanje već postojećeg objekta u objekat klase 
//TrkackoVozilo, moguće je pozvati i ovu metodu.
//Potrebno je dodati i to da se pri svakom pozivu metode “ispisi” poziva redefinisana metoda iz klase TrkackoVozilo, a ne originalna metoda “ispisi” klase Vozilo.

    }
}
