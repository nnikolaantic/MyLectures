/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Anta
 */
public class Recursion {
    
    public static void main(String[] args) {
     
//        helloWorldStackOverFlow();
        helloWorld(5);
        
//        System.out.println(reverse("---Simpanza---"));
        reverse("---Simpanza---");
        
//        Revers iteracijom
//        System.out.println(reverseString("---Simpanza---"));
        
    }
    
    
    private static void helloWorldStackOverFlow(){
//        Uvek moramo rekuziju zvati tek nakon izvrsavanja biznis logike metode
//        U suprotnom se ona nikad nece ni izvrsiti
//        helloWorldStackOverFlow(); 
        System.out.println("Hello World");
        helloWorldStackOverFlow();
        
    }
    
    private static void helloWorld(int brojac){
        
        System.out.println("HelloWorld" + brojac );
//        Exit strategy/ base case
        if(brojac <= 1){
            return;
        }     
        helloWorld(brojac - 1);       
    }
    
    private static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    
//    https://stackoverflow.com/questions/9723912/reversing-a-string-with-recursion-in-java
    
//    The function takes the first character of a String - str.charAt(0) - puts it at the end and then calls itself 
//    - reverse() - on the remainder - str.substring(1), adding these two things together to get its result 
//    - reverse(str.substring(1)) + str.charAt(0)
//
//    When the passed in String is one character or less and so there will be no remainder left 
//    - when str.length()  <= 1) - it stops calling itself recursively and just returns the String passed in.
//
//        So it runs as follows:
//
//        reverse("Hello")
//        (reverse("ello")) + "H"
//        ((reverse("llo")) + "e") + "H"
//        (((reverse("lo")) + "l") + "e") + "H"
//        ((((reverse("o")) + "l") + "l") + "e") + "H"
//        (((("o") + "l") + "l") + "e") + "H"
//        "olleH"
    
//    public static String reverse(String str) {
//        if ((null == str) || (str.length() <= 1)) {
//            return str;
//        }
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
    
//    Revers iteracijom
    public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
}  
}
