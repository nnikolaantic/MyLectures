/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraphBFS;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Anta
 */
public class Vertex<T>{
       
    private T data;
    private boolean visited;
    
//    https://www.javatpoint.com/java-list
    private LinkedList<Vertex<T>> neighbors = new LinkedList<>();
    
    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public LinkedList<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(LinkedList<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    //************************************
    public void addNeighbor(Vertex vertex){
        neighbors.add(vertex);
    }

    @Override
    public String toString() {
        return "Vertex with data : " + data;
    }
    
}