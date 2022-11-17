/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphDFS;

import java.util.*;

/**
 *
 * @author Anta
 */
//public class Vertex<T> {
public class Vertex {

//    private final T data;
    private int data;

    private boolean visited;

//    private List<Vertex<T>> neighbors = new ArrayList<>();
    private List<Vertex> neighbors = new ArrayList<>();

    public Vertex(int data) {
        this.data = data;
    }

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

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + ", visited=" + visited + '}';
    }
    
}