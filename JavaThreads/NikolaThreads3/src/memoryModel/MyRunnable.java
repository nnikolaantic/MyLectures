/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryModel;

/**
 *
 * @author Anta
 */
public class MyRunnable implements Runnable {

//  This count fild belongs to Runnable object so each runnable object will have its own count  
    private int count = 0;
    
//    @Override
//    public void run() {
//        //If we are creating object in run method
//        //Each thread will create its own object on heap and reference on thread stack
//        MyObject myObject = new MyObject();
//        System.out.println(myObject);
//        
//        
//        //Local variables are never shared between threads for example i
//        for (int i = 0; i < 1000000; i++) {
//            this.count++;
//        }
//        
//        System.out.println(Thread.currentThread().getName() + " : " + this.count);
//    }
    
    private MyObject myObject;

    public MyRunnable() {
    }

    public MyRunnable(MyObject myObject) {
        this.myObject = myObject;
    }
    
    @Override
    public void run() {
        System.out.println(myObject);
        
        for (int i = 0; i < 1000000; i++) {
            this.count++;
        }
        
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }

    
}
