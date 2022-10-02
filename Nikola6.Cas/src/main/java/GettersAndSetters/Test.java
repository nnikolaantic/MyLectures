/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GettersAndSetters;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        ClassExample ce =  new ClassExample("arg1","arg2","arg3","arg4");
        ce.losaPraksa = "Losa praksa";
//        ce.argument1
        System.out.println(ce.getArgument1());
        System.out.println(ce.getArgument2());
        System.out.println(ce.getArgument3());
        System.out.println(ce.getArgument4());
        
//        ce.argument1 = "123";
        ce.setArgument1("123");
        System.out.println(ce.getArgument1());
        
//        U buduce ce praksa biti da kada inicijalizujemo objekat i njegove argumente radicemo to konstruktorom
//        A kada menjamo vrednosti argumenata radicemo to seterima
//        A kada vracamo vrednosti argumenata radicemo to geterima

    }
}
