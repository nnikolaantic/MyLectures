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
//https://www.youtube.com/watch?v=ee6zIj4J3-Y
public class Node {
    char data;
    
    public Node(char data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node data is : " + data;
    }
    
}
