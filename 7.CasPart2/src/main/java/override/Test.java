/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();
        System.out.println("-------------------");
        
        Duck d = new Duck();
        d.sing();
        System.out.println("-----------------");
        
//        overload
        d.sing("QUAAAAAAACKK!");
    }
}
