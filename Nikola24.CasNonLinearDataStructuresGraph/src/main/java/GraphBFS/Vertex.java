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

//<T> Ovime nismo storog zadali kakav ce data nas Node(Vetex) dobijati
//Kao sto smo pre radili kada smo u okviru klase stavili private int data npr.  
//Ovime se pravili jedna fleksibilna i genericka klasa koja prima bilo koji objekat kao data
public class Vertex<T>{
       
    private T data;
    private boolean visited;
    
//    https://www.javatpoint.com/java-list
    private List<Vertex<T>> neighbors = new LinkedList<>();

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

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + ", visited=" + visited + '}';
    }
    
}
