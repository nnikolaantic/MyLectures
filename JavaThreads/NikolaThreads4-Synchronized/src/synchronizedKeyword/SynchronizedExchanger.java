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
public class SynchronizedExchanger {

    private Object object = null;

    //Instance methods that are tight with instance of SynchronizedExchanger obj or monitor object
    public synchronized void setObject(Object o) {
//        System.out.println("Set object " + Thread.currentThread().getName() + " | ");
        this.object = o;
    }

    public synchronized Object getObject() {
//        System.out.println("Get object " + Thread.currentThread().getName() + " | ");
        return this.object;
    }

    public void setObj(Object o) {
        synchronized (this) {
//            System.out.println("Set object " + Thread.currentThread().getName() + " | ");
            this.object = o;
        }
    }

    public Object getObj() {
        synchronized (this) {
//            System.out.println("Get object " + Thread.currentThread().getName() + " | ");
            return this.object;
        }
    }
}
