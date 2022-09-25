/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClasses;

/**
 *
 * @author JAVA4
 */
class Animal {
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
