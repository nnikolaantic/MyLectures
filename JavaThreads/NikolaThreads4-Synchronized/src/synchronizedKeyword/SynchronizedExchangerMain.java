/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedKeyword;

/**
 *
 * @author Anta
 */
public class SynchronizedExchangerMain {
    public static void main(String[] args) {
//        https://www.youtube.com/watch?v=eKWjfZ-TUdo&list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4&index=6
        SynchronizedExchanger exchanger = new SynchronizedExchanger();
        
        Thread thread1 = new Thread(
            new Runnable(){
                @Override
                public void run(){
                    for (int i = 0; i < 1000; i++) {
                        exchanger.setObject("" + i);
                    }
                }
            },"Thread 1"
        );
        
        Thread thread2 = new Thread(
            new Runnable(){
                @Override
                public void run(){
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(exchanger.getObject());
                    }
                }
            },"Thread 2"
        );
        
        thread1.start();
        thread2.start();
    }
}
