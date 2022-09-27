/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Anta
 */
public class MethodsInJava {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
//        String.valueOf();
//        valueOf  
        //Metoda je staticka sto znaci da je na nivou kalse i moze da se pozove bez inicijalizacije iste
        helloWorld();
        
        System.out.println("Nasa metoda za spajanje stringova vraca rezultat " + spojiStringove("123", "456"));
        System.out.println("Nasa metoda za sabiranje intidzera vraca rezultat " + saberi(18,20));
        
        izracunaj(36,6,"/");
        
    }
    
    public static void helloWorld(){
        System.out.println("Hello World!");
    }
    
    public static String spojiStringove(String string1, String string2){
        String spajanje = string1 + string2;
        return spajanje;
    }
    
    public static int saberi(int prviBroj, int drugiBroj){
        int zbir = prviBroj + drugiBroj;
        return zbir;
    }
    
    public static void izracunaj(int prviBroj, int drugiBroj, String operator){
        switch(operator){
            case "+":
                System.out.println("Zbir brojeva je : ");
                System.out.print(prviBroj + drugiBroj);
                break;
            case "-":
                System.out.print("Razlika brojeva je : ");
                System.out.println(prviBroj - drugiBroj);
                break;
            case "/":
                System.out.print("Kolicnik brojeva je : ");
                System.out.print(prviBroj / drugiBroj);
                break;
            case "*":
                System.out.print("Proizvod brojeva je : ");
                System.out.print(prviBroj * drugiBroj);
                break;
            case "%":
                System.out.print("Modulus brojeva je : ");
                System.out.print(prviBroj % drugiBroj);
                break;
            default:
                System.out.print("Uneli ste nepostojeci operator");
        }
    }
    
}
