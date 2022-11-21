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
public class Test {
    public static void main(String[] args) {
//        int matrix[][] = {
//                            {0,1,0,0,0},
//                            {0,0,1,0,0},
//                            {0,0,0,1,1},
//                            {0,0,0,0,0},
//                            {1,0,1,0,0}
//                        };
//        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
//            for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        matrix[0][1] = 1; ovako se pravi konekcija 
        
        Graph graph = new Graph(5);
                                        //index
        graph.addNode(new Node('A'));     //0  
        graph.addNode(new Node('B'));     //1  
        graph.addNode(new Node('C'));     //2  
        graph.addNode(new Node('D'));     //3  
        graph.addNode(new Node('E'));     //4
        
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
