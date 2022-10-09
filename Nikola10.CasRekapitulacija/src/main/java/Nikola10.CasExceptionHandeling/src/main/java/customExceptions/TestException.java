/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customExceptions;

/**
 *
 * @author Anta
 */
public class TestException {
    public static void main(String[] args) throws AgeException {
        validateAge(2);
//        validateAge(18);
    }
    
//    public static void validateAge(int age) throws Exception {
//        if(age < 18){
////            throw new AgeException();
//            throw new Exception("Nas exception");
//            throw new AgeException("Ovo trenutno ne moze");
//        }
//    }
    
    public static void validateAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("Ne mozete uci ukoliko imate manje od 18 godina");
//            throw new AgeException("Ne mozete uci ukoliko imate manje od 18 godina",new RuntimeException());
        }
    }
}
