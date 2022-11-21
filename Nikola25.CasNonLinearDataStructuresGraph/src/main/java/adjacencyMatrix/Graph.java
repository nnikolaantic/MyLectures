/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacencyMatrix;

import java.util.ArrayList;

/**
 *
 * @author Anta
 */
public class Graph {
    ArrayList<Node> aList;
    int[][] matrix;
    
    public Graph(int size){
        aList = new ArrayList<>();
        matrix = new int[size][size];
    }
    
    public void addNode(Node node){
        aList.add(node);
    }
    
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    
//    public boolean checkEdge(int src, int dst){
//        if (matrix[src][dst] == 1) {
//            return true;
//        }
//        return false;
//    }
    
    public void print(){
        System.out.print("  ");
        
        for (Node node : aList) {
            System.out.print(node.data + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(aList.get(i).data +  " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
