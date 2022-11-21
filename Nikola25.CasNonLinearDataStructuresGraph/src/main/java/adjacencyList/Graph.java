/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Anta
 */
public class Graph {
    
    ArrayList<LinkedList<Node>>  aList;
    
    public Graph(){
        aList = new ArrayList<>();
    }
    
    public void addNode(Node node){
        LinkedList<Node> tempList  = new LinkedList<>();
        tempList.add(node);
        aList.add(tempList);
    }
    
    public void addEdge(int src, int dst){
        LinkedList<Node> tempList  = aList.get(src);
        Node dstNode = aList.get(dst).get(0);
        tempList.add(dstNode);
    }
    
//    public boolean checkEdge(int src, int dst){
//        LinkedList<Node> tempList  = aList.get(src);
//        Node dstNode = aList.get(dst).get(0);
//        
//        for (Node node : tempList) {
//            if (node == dstNode) {
//                return true;
//            }
//        }
//        return false;
//    }
    public void print(){
        for (LinkedList<Node> tempList : aList) {
            for (Node node : tempList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println("");
        }
    }
}
