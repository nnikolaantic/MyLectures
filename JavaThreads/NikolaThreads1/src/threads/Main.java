/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Anta
 */
public class Main {
//    https://www.youtube.com/watch?v=a_LBuCx1KTE
//    thread = A thread of execution in a program (kind of like a virtual CPU) The JVM allows an application to have multiple 
//            threads running concurre Each thread can execute parts of you code in parallel with the main thr: Each thread has a priority. 
//            Threads with higher priority are executed in preference compared to thr: 
//            The Java Virtual MachiNe continues to execute threads until either of the following occurs
//            1. The exit method of class Runtime has been called 
//            2. All user threads have died 
//            When a JVM starts up there is a thread which calls the main method
//            This thread is called "main"
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("TestTestTest");
//        System.out.println(Thread.currentThread().getName());
//        
//        // All threads have priority
//        System.out.println(Thread.currentThread().getPriority());
//        // Scale from 1 to 10 higher the number higher the prority
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(1);
//        System.out.println(Thread.currentThread().getPriority());
//        
//        // We can also check if our thread is alive
//        System.out.println(Thread.currentThread().isAlive());
//        
//        //We can also sleep our thread
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000); // Probati sa ovim i bez ovoga
//        }
//        System.out.println("Counting is done");
        
        //=======================================================================
        //=======================================================================
        //=======================================================================
        
        //Lets make another thread besides main thread
//        MyThread thread2 = new MyThread();
//        // Lets see if this thread is alive
//        System.out.println(thread2.isAlive());
//        //Ovo ce da izvrsi run metodu ali nece da ozivi nit run pokrece metodu ali ne pokrece novu nit
//        //Ako pokrenem 2 niti da odborjavaju od 10 do 0 sa run metodom kod bi se izvrsavao sekvencioni kao da i nema niti
//        thread2.run();
//        System.out.println(thread2.isAlive());
//        
//        //Start poziva run i ozivljava nit
//        thread2.start();
//        System.out.println(thread2.isAlive());
//        
//        System.out.println(thread2.getName());
//        thread2.setName("DrugaNit");
//        System.out.println(thread2.getName());
//        
//        // Nit uvek nasledjuje prioritet niti koja ju je kreirala po deafaultu je 5
//        // ali ako stavim da nit prioriteta 10 pravi child nit taj child nit ce imati 
//        // takodje prioritet 10
//        System.out.println(thread2.getPriority());
//        
//        thread2.setPriority(1);
//        System.out.println(thread2.getPriority());
//        
//        //Lets check again how many threads are active now
//        System.out.println("Acitive threads");
//        System.out.println(Thread.activeCount());
        
        //=======================================================================
        //=======================================================================
        //=======================================================================
        
        
        //There are two different types of threads
        // There are User threads(the ones that we just created)
        // There are Deamon threads
        
        //Deamon thread is a low priority thread that runs 
//        in the background to perform tasks such as garbage collection
//          JVM terminates itself when all user threads(non-deamon threads)
//          Finish their execution

//        Lets create Deamon thread
        MyThread deamonThread = new MyThread();
        System.out.println(deamonThread.isDaemon());
        
        deamonThread.setDaemon(true);
        System.out.println(deamonThread.isDaemon());
        
        // Lets start our deamon thread now
        deamonThread.start();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        // JVM does not care about deamon threads running it will terminate regardles
    }
}
