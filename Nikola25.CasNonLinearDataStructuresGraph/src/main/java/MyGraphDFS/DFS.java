/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraphDFS;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Anta
 */
public class DFS {
        
    public void traverse(Vertex startVertex) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println("Vertex: " + current.getData() + " Neigbours: " + current.getNeighbors());
                Collections.reverse(current.getNeighbors());
                for (Vertex neighbor : current.getNeighbors()) {
                    stack.push(neighbor);
                }
            }
        }
    }
    
    public void traverseRecurevly(Vertex vertex){
        vertex.setVisited(true);
        System.out.println(vertex);
        for (Vertex neighbor : vertex.getNeighbors()) {
            if (!neighbor.isVisited()) {
                traverseRecurevly(neighbor);
            }
        }
    }
    
    public static void main(String[] args) {
        
        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        
        v0.addNeighbor(v1);
        v0.addNeighbor(v5);
        v0.addNeighbor(v6);
        
        v1.addNeighbor(v3);
        v1.addNeighbor(v4);
        v1.addNeighbor(v5);
        
        v4.addNeighbor(v2);
        v4.addNeighbor(v6);
        
        v6.addNeighbor(v0);

        DFS dfs = new DFS();

//        dfs.traverse(v0);
        System.out.println("----------------------------");
        dfs.traverseRecurevly(v0);
    }
}
