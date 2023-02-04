/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedKeywordStatic;

/**
 *
 * @author Anta
 */
public class StaticSynchronizedExchanger {

    private static Object object = null;

    //This is not bound with instance its bound to class
    //Ovde je sama class-a monitor object a ne instanca/objekat kalse
    public static synchronized void setObject(Object o) {
        object = o;
    }

    public static synchronized Object getObject() {
        return object;
    }

    public static void setObj(Object o) {
        synchronized (StaticSynchronizedExchanger.class) {
            object = o;
        }
    }

    public static Object getObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return object;
        }
    }
}
