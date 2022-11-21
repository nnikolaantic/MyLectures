/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphBFS;

import java.util.*;


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
            Vertex<T> current = queue.poll();
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
        
        v0.setNeighbors(Arrays.asList(v1,v5,v6));
        v1.setNeighbors(Arrays.asList(v3,v4,v5));
        v4.setNeighbors(Arrays.asList(v2,v6));
        v6.setNeighbors(Arrays.asList(v0));
        
        BFS<Integer> bfs = new BFS<>(v0);

        bfs.traverse();
        
   }
    
}
