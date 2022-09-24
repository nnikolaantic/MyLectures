/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsInJava;

/**
 *
 * @author Anta
 */
public class OperatorsInJava {
    public static void main(String[] args) {
//        System.out.println(" - ; + ; * ; / ; %");
//        
//        int i = 1;
////        Pre-Incement
////        System.out.println("Increment " + i++);
////        Post-Incement
//        System.out.println("Increment " + ++i);
//        
//        int y = 1;
////        Pre-Decrement
////        System.out.println("Decement "  + y--);
////        Post-Decrement
//        System.out.println("Decement "  + --y);
//        
//        boolean t = true;
////        Logical not operator
//        System.out.println("Invert boolean vrednosti " + !t);
////        Kada zelimo da okinemo komandu na uslov false
//        t = false;
//        if(!t){
//            System.out.println("Uslov koji okidamo na false");
//        }
//        
////        = operator 
//        int s = 10;
//        System.out.println("Value of variable s is: " + s);
//        s = 20;
//        System.out.println("Value of variable s is: " + s);
//        
//        int a = 5;
//        int b = 15;
//        int c;
//        
//        c = a += b;
//        System.out.println("a += b ---> " + c);
//        
//        c = a -= b;
//        System.out.println("a -= b ---> " + c);
//        
//        c = a *= b;
//        System.out.println("a *= b ---> " + c);
//        
//        c = b /= a;
//        System.out.println("b /= a ---> " + c);
//        System.out.println(15 / 5);
//        
//        c = b %= a;
//        System.out.println("b %= a ---> " + c);
//        System.out.println(15 % 5);
//        
//        
////        Relacioni operatori
//        System.out.println(" == ; != ; < ; > ; <= ; >=");
//        int e = 1;
//        int f = 1;
//        boolean g;
//        
//        g = 1 == 1;
//        System.out.println("1 == 1 --->" + g);
//        
//        g = 1 != 1;
//        System.out.println("1 != 1 --->" + g);
//        
//        g = 1 < 1;
//        System.out.println("1 < 1 --->" + g);
//        
//        g = 1 > 1;
//        System.out.println("1 > 1 --->" + g);
//        
//        g = 1 <= 1;
//        System.out.println("1 <= 1 --->" + g);
//        
//        g = 1 >= 1;
//        System.out.println("1 >= 1 --->" + g);
//        
//        System.out.println("");
//        System.out.println("--------------------");
//        
////        Logicki operatori
//        
////        i && operator
////        Gleda uslov sa leve strane
////        Ukoliko je on netacan 
////        i && operator odmah vraca false
////        ukoliko je uslov sa leve strane tacan
////        i && operator gleda uslov sa desne strane
////        ukoliko je uslov sa desne strane netacan
////        i && operator vraca false
////        ukoliko je uslov i sa desne strane tacan
////        i && operator vraca true
//
////        i && operator vraca true samo ako su oba uslova tacna
//        
//        boolean iTest1;
//        boolean iTest2;
//        
//        iTest1 = true;
//        iTest2 = true;
//        if(iTest1 && iTest2){
//            System.out.println("i && primer kada su oba uslova true");
//        }
//        
//        iTest1 = true;
//        iTest2 = false;
//        if(iTest1 && iTest2){
//            System.out.println("i && primer kada je prvi uslov false a drugi uslov true");
//        }
//        
//        iTest1 = false;
//        iTest2 = true;
//        if(iTest1 && iTest2){
//            System.out.println("i && primer kada je prvi uslov true a drugi uslov false ");
//        }
//        
//        iTest1 = false;
//        iTest2 = false;
//        if(iTest1 && iTest2){
//            System.out.println("i && primer kada su oba uslova false");
//        }
//        
//        System.out.println("");
////        ili && operator
////        gleda uslov sa leve strane
////        ukoliko je uslov sa leve strane tacan
////        ili && operator vraca true i ne gleda drugi operator
////        ukoliko je uslov sa leve strane netacan
////        tek tada
////        ili && operator gleda uslov sa desne strane
////        ukoliko je uslov sa desne strane tacan
////        ili && operator vraca true
//        
////        ili && operator vraca true ukoliko je neki od uslova tacan
//
//        boolean iliTest1;
//        boolean iliTest2;
//        
//        iliTest1 = true;
//        iliTest2 = true;
//        if(iliTest1 || iliTest2){
//            System.out.println("ili || primer kada su oba uslova true");
//        }
//        
//        iliTest1 = true;
//        iliTest2 = false;
//        if(iliTest1 || iliTest2){
//            System.out.println("ili || primer kada je prvi uslov false a drugi uslov true");
//        }
//        
//        iliTest1 = false;
//        iliTest2 = true;
//        if(iliTest1 || iliTest2){
//            System.out.println("ili || primer kada je prvi uslov true a drugi uslov false ");
//        }
//        
//        iliTest1 = false;
//        iliTest2 = false;
//        if(iliTest1 || iliTest2){
//            System.out.println("ili || primer kada su oba uslova false");
//        }

        //Ternary operator takozvani fancy if-else
        
        String fancyIfElse;
        fancyIfElse = true ? "kod koji se izvrsava na true" : "kod koji se izvrsava na false";
        System.out.println(fancyIfElse);
        
        int n1 = 5, n2 = 10, rez;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Performing ternary operation
        rez = (n1 > n2) ? (n1 + n2) : (n1 - n2);
 
        // Print the largest number
        System.out.println("Result = " + rez);
    }
}
