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
//public class AgeException extends RuntimeException{
//public class AgeException extends IllegalArgumentException{
public class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
        public AgeException(String message, Throwable cause){
        super(message, cause);
    }
}
