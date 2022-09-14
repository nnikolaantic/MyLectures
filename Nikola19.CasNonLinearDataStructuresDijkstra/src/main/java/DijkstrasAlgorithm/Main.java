/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstrasAlgorithm;

import java.util.List;

/**
 *
 * @author Anta
 */
public class Main {
    public static void main(String[] args) {
//        Vertex<String> nodeA = new Vertex<>("A");
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");


        vertexA.addAdjacentVertex(vertexB, 2);
        vertexA.addAdjacentVertex(vertexC, 4);

        vertexB.addAdjacentVertex(vertexC, 3);
        vertexB.addAdjacentVertex(vertexD, 1);
        vertexB.addAdjacentVertex(vertexE, 5);

        vertexC.addAdjacentVertex(vertexD, 2);

        vertexD.addAdjacentVertex(vertexE, 1);
        vertexD.addAdjacentVertex(vertexF, 4);

        vertexE.addAdjacentVertex(vertexF, 2);

        Dijkstra<String> dijkstra = new Dijkstra<>();
        dijkstra.calculateShortestPath(vertexA);
        dijkstra.printPaths(List.of(vertexA, vertexB, vertexC, vertexD, vertexE, vertexF));
    }
}
