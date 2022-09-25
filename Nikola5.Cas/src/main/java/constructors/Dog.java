/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author JAVA4
 */
public class Dog {
    public String vrsta;
    public int godine;
    public char pol;
    public String ime;

    public Dog() {
        //prazan/default konstruktor
    }
    
    public Dog(String vrsta, int godine, char pol, String ime) {
        this.vrsta = vrsta;
        this.godine = godine;
        this.pol = pol;
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Ime: " + this.ime + "\ngodine: " + this.godine + "\npol : " + this.pol + "\nvrsta: " + this.vrsta;
    }
    
    
    
}
