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
//public class <T>Vertex{
public class Vertex{
       
//    private T data;
    private int data;
    private boolean visited;

//    private List<Vertex<T>> neighbors = new LinkedList<>();
    private List<Vertex> neighbors = new LinkedList<>();

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

//    public List<Vertex<T>> getNeighbors() {
//        return neighbors;
//    }
    public List<Vertex> getNeighbors() {
        return neighbors;
    }

//    public void setNeighbors(List<Vertex<T>> neighbors) {
//        this.neighbors = neighbors;
//    }
    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public Vertex(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + ", visited=" + visited + '}';
    }
    
    
    
}
