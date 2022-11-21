/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacencyList;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        
        Graph graph = new Graph();
//                                        INDEX
        graph.addNode(new Node('A'));      //0
        graph.addNode(new Node('B'));      //1  
        graph.addNode(new Node('C'));      //2
        graph.addNode(new Node('D'));      //3
        graph.addNode(new Node('E'));      //4
        
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        
        graph.print();
    }
}
