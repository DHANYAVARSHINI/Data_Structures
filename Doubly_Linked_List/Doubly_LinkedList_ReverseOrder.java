/*package whatever //do not write package name here */

import java.io.*;

class Node{
    int data;
    Node prev;
    Node next;
    public Node(int d){
        data = d;
        prev = null;
        next = null;
    }
}
class Doubly_LinkedList{
    Node head = null;
    static int size = 0;
    
    // Insertion
    
    // Method for inserting a node at the end
    void insert_end(int d){
        Node node = new Node(d);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
        size++;
    }
    
    // Method for printing the node values in reverse order
    void reverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    
    // Method for displaying the node
    void display()
    {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
}

// Main class
public class Doubly_LinkedList_ReverseOrder{
    public static void main(String args[]){
        Doubly_LinkedList dll = new Doubly_LinkedList();
        // Displaying the inserted node at the end
        dll.insert_end(40);
        dll.insert_end(60);
        dll.insert_end(20);
        dll.insert_end(70);
        dll.display();
        System.out.println();
        
        // Displaying the reverse order of  nodes 
        dll.reverse();
        
        
        
    }
}