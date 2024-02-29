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
    
    // Method for inserting a node at front
    void insert_front(int d){
        Node node = new Node(d);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    
    // Method for inserting the node by using the index positon(data, index_pos)
    void insert_index(int d, int index){
        if(index == 0){
            insert_front(d);
        }
        else if(index >= size){
            insert_end(d);
        }
        else{
            int i = 1;
            Node temp = head;
            Node node = new Node(d);
            while(i < index){
                i++;
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
            size++;
        }
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

//// Main class
public class Doubly_LinkedList_Insertion{
    public static void main(String args[]){
        Doubly_LinkedList dll = new Doubly_LinkedList();
        // Displaying the inserted node at the end
        dll.insert_end(40);
        dll.insert_end(60);
        dll.insert_end(20);
        dll.insert_end(70);
        dll.display();
        System.out.println();
        
        // Displaying the inserted node at the front
        dll.insert_front(52);
        dll.insert_front(63);
        dll.display();
        System.out.println();
        
        // Displaying the inserted node by using index value
        dll.insert_index(100, 3);
        dll.display();
        System.out.println();
    }
}