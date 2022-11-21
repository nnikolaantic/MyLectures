/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraphBFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Anta
 */
public class BFS<T>{
    private Vertex<T> startVertex;

    public BFS(Vertex startVertex) {
        this.startVertex = startVertex;
    }
    
    public void traverse(){
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);
        while(!queue.isEmpty()) {
//            https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
            Vertex<T> current = queue.remove();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println("Vertex: " + current.getData() + " Neigbours: " + current.getNeighbors());
                queue.addAll(current.getNeighbors());
            }
        }
    }
    
    public static void main(String[] args) {
        
        Vertex<Integer> v0 = new Vertex(0);
        Vertex<Integer> v1 = new Vertex(1);
        Vertex<Integer> v2 = new Vertex(2);
        Vertex<Integer> v3 = new Vertex(3);
        Vertex<Integer> v4 = new Vertex(4);
        Vertex<Integer> v5 = new Vertex(5);
        Vertex<Integer> v6 = new Vertex(6);
        
        v0.addNeighbor(v1);
        v0.addNeighbor(v5);
        v0.addNeighbor(v6);
        
        v1.addNeighbor(v3);
        v1.addNeighbor(v4);
        v1.addNeighbor(v5);
        
        v4.addNeighbor(v2);
        v4.addNeighbor(v6);
        
        v6.addNeighbor(v0);
        
        BFS<Integer> bfs = new BFS<>(v0);

        bfs.traverse();
        System.out.println("-------------------");
        
   }
    
}