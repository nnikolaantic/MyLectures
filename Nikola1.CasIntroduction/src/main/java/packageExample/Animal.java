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
public class Animal {
    int age = 3;
    int dogAge = age * 7;
    String whoAmI = "dog";
    
    public static void woof(){
        System.out.println("Woof woof");
    }
    
    public void angryDog(String koliko){
        if(koliko.equals("Malo")){
            for (int i = 0; i < 3; i++) {
                woof();
            }
        }else if(koliko.equals("Mnogo")){
            for (int i = 0; i < 10; i++) {
                woof();
            }
        }else{
            System.out.println("Ne znam sta da radim");
        }
    }
    
    public void happyDog(){
        int brojac = 0;
        while(brojac != 50){
            System.out.println("Wiggle Tail ----------- wiggle wiggle");
            brojac++;
        }
    }
}
