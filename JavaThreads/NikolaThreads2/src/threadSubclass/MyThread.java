/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadSubclass;

/**
 *
 * @author Anta
 */
  public class MyThread extends Thread {

    @Override
    public void run(){
       System.out.println("MyThread running");
    }
  }
