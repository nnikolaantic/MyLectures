/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionHandeling;

import java.util.*;

/**
 *
 * @author Anta
 */
public class ExceptionExample {
    public static void main(String[] args) {
//        exception = error that ocurs during the execution of the program that
//                        disrupts the normal flow of the program
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Unesite deljenik : ");
            int x = scan.nextInt();

            System.out.println("Unesite delilac : ");
            int y = scan.nextInt();

            int z = x/y;

            System.out.println("Rezultat je : " + z);
        }catch(ArithmeticException e){
            System.out.println("Glupane ne mozes da delis sa nulom");
            System.out.println("Greska koju smo uhvatili je : " + e.getLocalizedMessage());
        }catch(InputMismatchException e){
            System.out.println("Moras uneti broj");
            System.out.println("Greska koju smo uhvatili je : " + e.getLocalizedMessage());
        }catch(Exception e){
            //Univerzalni catch
            System.out.println("Ovo je catch koji hvata svaki exception");
            System.out.println("Something went wrong : " + e.getLocalizedMessage());
        }finally{
//            Ovo se izvrsva cak i ako program naidje na gresku
//            Sa finally keywordom garantujemo da ce nesto da se
//            izvrsi bez obzira na potencijalne greske
            System.out.println("This will always print");
            scan.close();
        }
        
    }
}
