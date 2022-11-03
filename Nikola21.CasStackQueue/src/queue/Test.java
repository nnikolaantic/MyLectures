/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        mq.enqueue(4);
        mq.enqueue(5);
        mq.enqueue(6);
        
        mq.display();
        
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.display();
        
        Node n1 = mq.dequeue();
        System.out.println(n1);
        
        mq.enqueue(33);
        Node n2 = mq.dequeue();
        System.out.println(n2);
    }
}
