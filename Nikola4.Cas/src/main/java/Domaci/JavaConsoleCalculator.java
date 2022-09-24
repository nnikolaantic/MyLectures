/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaci;

import java.util.Scanner;

/**
 *
 * @author Anta
 */
public class JavaConsoleCalculator {
    public static void main(String[] args) {
        
        boolean calculatorPower = true;
        
        while(calculatorPower){
            System.out.println("Pocinjemo");
            Scanner scan = new Scanner(System.in);

            System.out.println("Unesite vas prvi broj ");
            double prviBroj = scan.nextDouble();

            System.out.println("Unesite vas drugi broj: ");
            double drugiBroj = scan.nextDouble();

            System.out.println("Unesite operator ('+','-','*','/',%):");
            String operacija = scan.next();

            switch(operacija){
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
            System.out.println("\nAko zelite da nastavite ukucajte y ukoliko zelite da ugasite kalkulator ukucajte n");
            String power = scan.next();
            if(power.equals("n")){
                calculatorPower = false;
                System.out.println("Calculator je ugasen");
            }else
                continue;
        }
    }
}
