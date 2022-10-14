/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak3;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        Adresar a = new Adresar();
        Kontakt k1 = new Kontakt();
        k1.setImePrezime("Pera Peric");
        k1.setAdresa("Oblakovska 1");
        k1.setTelefon(123456);
        a.unesiUAdresar(k1);
        Kontakt k2 = new Kontakt();
        k2.setImePrezime("Mika Mikic");
        k2.setAdresa("Strahinjica Bana 1");
        k2.setTelefon(654321);
        a.unesiUAdresar(k2);
        a.unesiUAdresar("Laza Lazic", "Kneza Milosa 1", 567890);
        a.unesiUAdresar("Zika Zikic", "Karadjordjeva 1", 987654);
        a.ispisi();

//        TODO more
    }
}
