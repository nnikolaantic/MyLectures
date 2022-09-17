/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageExample;

/**
 *
 * @author Anta
 */
public class JavaClassExample {
    public static void main(String[] args) {
        
        int i = 10;
        long l = 4000;
        double d = 14.2;
        char c = 'c';
        
//        long rezultat = i + l;
//        System.out.println(rezultat);
        
        String s = "String";
        String s1 = "StrinG";
//        s.compareTo(s1);
        
//        System.out.println(s.compareTo(s1));
//        System.out.println(s.toLowerCase().compareTo(s1.toLowerCase()));

//        if(s.compareTo(s1) == -1){
//            System.out.println("Stringovi su razliciti");
//        }else if (s.compareTo(s1) == 0){
//            System.out.println("Stringovi su isti");
//        }else{
//            System.out.println("Nesto nije u redu sa njima :(");
//        }
        
//        uporediString(s1, s1);
        
        Animal a = new Animal();
        System.out.println("I am " + a.whoAmI + " and Im " + a.dogAge + " years old");
        a.woof();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------");
        a.angryDog("Mnogo");
        a.happyDog();
    }
    
    public static void uporediString(String s1,String s2){
        String prviString = s1.toLowerCase();
        String drugiString = s2.toLowerCase();
        
        if(prviString.compareTo(drugiString) == -1){
            System.out.println("Stringovi su razliciti");
        }else{
            System.out.println("Stringovi su isti");
        }
    }
}
