class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class LinkedList{
    Node head=null;
    static int size=0;
   
    //Method to insert node at the end
    void insert_end(int d){
        Node node=new Node(d);//creating Node
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            
        }
        size++;
    }
   
    //Method to insert node at the first
    void insert_first(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
        
    }
   
    //Method to insert node in the particular index position
    void insert_index(int d,int index){
        Node node=new Node(d);
        //if index is 0 i.e. we need to insert before head
        if(index==0){
            insert_first(d);
        }
        //if index is greater than size we need to insert at the end
        else if(index>=size){
            insert_end(d);
        }
        else{
            int i=1;
            Node temp=head;
            while(i<index && temp.next!=null){
                i++;
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }
   
    //Method to display the LinkedList
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class Singly_Linkedlist_Insertion{
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        
        // Displaying the node in the end
        ll.insert_end(10);
        ll.insert_end(50);
        ll.display();
        System.out.println();
        // Displaying the node in the first
        ll.insert_first(15);
        ll.insert_first(35);
        ll.display();
        System.out.println();
        // Displaying the node by using the index position(data,index value)
       ll.insert_index(100, 3);
       ll.display();
    }
}