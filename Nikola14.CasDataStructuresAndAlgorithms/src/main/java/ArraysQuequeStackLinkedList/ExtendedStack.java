/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;

import java.util.Stack;

/**
 *
 * @author Anta
 */
public class ExtendedStack extends Stack {
    
    @Override
    public String peek(){
        System.out.println("Moja verzija peek-a");
        return "Peek @Overide";       
    }
}
