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
    
    // Deletion
    // Method for deleting a first node
    void delete_first(){
        if(head != null){
            if(head.next == null){
                head = null;
            }
            else{
                Node temp = head.next;
                temp.prev = null;
                head.next = null;
                head = temp;
            }
            size--;
        }
    }
    
    // Method for deleting a last node
    void delete_last(){
        if(head != null){
            if(head.next == null){
                head = null;
            }
            else{
                Node temp = head;
                while(temp.next != null && temp.next.next != null){
                    temp = temp.next;
                }
                temp.next.prev = null;
                temp.next = null;
            }
            size--;
        }
    }
    
    // Method for deleting a node by using the index_position
    void delete_index(int index){
        if(index < size){
            if(index == 0){
                delete_first();
            }
            else if(index == size-1){
                delete_last();
            }
            else{
                Node temp = head;
                int i = 1;
                while(i < index && temp.next != null){
                    i++;
                    temp = temp.next;
                }
                temp.next.next.prev  = temp;
                temp.next = temp.next.next;
            }
            size--;
        }
        
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
public class Doubly_Linked_List{
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
        
        // Displaying the nodes after the deletion of the first node
        dll.delete_first();
        dll.display();
        System.out.println();
        
        // Displaying the nodes after the deletion of the last node
        dll.delete_last();
        dll.display();
        System.out.println();
        
        // Displaying the nodes after the deletion of the last node
        dll.delete_index(2);
        dll.display();
        System.out.println();
        
    }
}