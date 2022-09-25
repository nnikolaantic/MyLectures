/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author JAVA4
 */
public class JavaConstructors {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.godine = 2;
        dog1.ime = "Maks";
        dog1.pol = 'm';
        dog1.vrsta = "Mesanac";
        
        System.out.println("Ime: " + dog1.ime + "\ngodine: " + dog1.godine + "\npol : " + dog1.pol + "\nvrsta: " + dog1.vrsta);
        
        Dog dog2 = new Dog();
        dog2.godine = 1;
        dog2.ime = "Rea";
        dog2.pol = 'z';
        dog2.vrsta = "Pudla";
        
        System.out.println("Ime: " + dog2.ime + "\ngodine: " + dog2.godine + "\npol : " + dog2.pol + "\nvrsta: " + dog2.vrsta);
        
        
        Dog dogConstuctor = new Dog("Zlatni retriver" , 5 , 'm', "Rex");
        
        System.out.println("Ime: " + dogConstuctor.ime + "\ngodine: " + dogConstuctor.godine + 
                            "\npol : " + dogConstuctor.pol + "\nvrsta: " + dogConstuctor.vrsta);
        
        System.out.println("------------------toString---------------");
        System.out.println(dogConstuctor.toString());

    }
}
