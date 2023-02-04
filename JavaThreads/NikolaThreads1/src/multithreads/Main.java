/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

/**
 *
 * @author Anta
 */
public class Main {
//    https://www.youtube.com/watch?v=J09TLPgwd0Y
    // Multithreading = Process of executing multiple threads simultaneously 
//    Helps maximum utilization of CPU 
//    Threads are independent, they don't affect the execution of other threads.
//    An exception in one thread will not interrupt other threads 
//    useful for serving multiple clients, multiplayer games, or other mutually independend tasks 

    public static void main(String[] args) throws InterruptedException {

        //There are 2 different ways to create Threads in java we can Thread subclass   
        // Create a subclass of Thread
        MyThread thread1 = new MyThread();

        //or 
        //implement Runnable interface and pass instance as an argument to Thread() 
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //Oba nacina su kull licno mislim da je bolje da se ide sa Runnable interfejsom
//     Jer onda idalje mozemo da nsaldimo neku drugu klasu
//     Isao bi preko extends Thread jedino ako zelim da gazim vise od 1 metode
        //thread1.setDaemon(true);
        //thread2.setDaemon(true);
        thread1.start();
//        thread1.join(); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread1.join(3000); //odlozeni start
        thread2.start(); 
        // Takodje i ako slomimo main metod ove niti nastavljaju dalje sa radom
//        System.out.println(1 / 0);

        //System.out.println(1/0);
    }
}
