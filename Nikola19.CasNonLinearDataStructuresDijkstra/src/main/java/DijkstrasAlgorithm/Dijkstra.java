/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstrasAlgorithm;

/**
 *
 * @author Anta
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dijkstra<T> {

    public void calculateShortestPath(Vertex source) {
        source.setDistance(0);
        Set<Vertex> settledNodes = new HashSet<>();
        Queue<Vertex> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));
        while (!unsettledNodes.isEmpty()) {
            Vertex currentNode = unsettledNodes.poll();
            currentNode.getAdjacentVertex()
                    .entrySet().stream()
                    .filter(entry -> !settledNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unsettledNodes.add(entry.getKey());
                    });
            settledNodes.add(currentNode);
        }
    }

    private void evaluateDistanceAndPath(Vertex adjacentNode, Integer edgeWeight, Vertex sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShorthestPath(Stream.concat(sourceNode.getShorthestPath().stream(), Stream.of(sourceNode)).toList());
        }
    }

    public void printPaths(List<Vertex> nodes) {
        nodes.forEach(node -> {
            String path = node.getShorthestPath().stream()
                    .map(Vertex::getName).map(Objects::toString)
                    .collect(Collectors.joining(" -> "));
            System.out.println((path.isBlank()
                    ? "%s : %s".formatted(node.getName(), node.getDistance())
                    : "%s -> %s : %s".formatted(path, node.getName(), node.getDistance()))
            );
        });
    }
}