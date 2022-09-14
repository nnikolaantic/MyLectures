/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstrasAlgorithm;

import java.util.*;

/**
 *
 * @author Anta
 */
public class Vertex implements Comparable<Vertex>{
    
    private String name;
    private Integer distance = Integer.MAX_VALUE;
    
    private List<Vertex> shorthestPath = new LinkedList<>();
    private Map<Vertex, Integer> adjacentVertex = new HashMap<>();

    public Vertex(String name) {
        this.name = name;
    }
    
    
    public void addAdjacentVertex(Vertex vertex, int weight){
        adjacentVertex.put(vertex, weight);
    }
            
    @Override
    public int compareTo(Vertex vertex) {
        return Integer.compare(this.distance, vertex.getDistance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<Vertex> getShorthestPath() {
        return shorthestPath;
    }

    public void setShorthestPath(List<Vertex> shorthestPath) {
        this.shorthestPath = shorthestPath;
    }

    public Map<Vertex, Integer> getAdjacentVertex() {
        return adjacentVertex;
    }

    public void setAdjacentVertex(Map<Vertex, Integer> adjacentVertex) {
        this.adjacentVertex = adjacentVertex;
    }
    
    
}
