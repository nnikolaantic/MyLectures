/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacencyMatrix;

/**
 *
 * @author Anta
 */
public class Node {
    char data;
    
    public Node(char data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node with data : " + data;
    }
    
}
