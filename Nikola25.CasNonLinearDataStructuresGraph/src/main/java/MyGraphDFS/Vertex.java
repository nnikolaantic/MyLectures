/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraphDFS;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Anta
 */
public class Vertex {

    private int data;

    private boolean visited = false;
    
    private LinkedList<Vertex> neighbors = new LinkedList<>();

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

    public void setNeighbors(LinkedList<Vertex> neighbors) {
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
