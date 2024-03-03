class Node{
    int data;
    Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}
class Queue{
    Node front = null, rear = null;
    static int size = 0;
    
    // Method for Enqueueing the elements
    void enQueue(int d){
        Node node = new Node(d);
        if(front == null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }
    
    // Method to check whether the Queue is empty or not
    boolean isEmpty(){
        return front == null;
    }
    
    // Method for Dequeing the elements
    int deQueue(){
        if(isEmpty()){
            return -1;
        }
        int val = front.data;
        front = front.next;
        size--;
        return val;
    }
    
    // Method for displaying the elements
    void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
class Queue_Using_LinkedList{
    public static void main(String args[]){
        Queue que = new Queue();
        // Displaying the Enqueueing elements
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.enQueue(40);
        que.display();
        System.out.println();
        
        // // Displaying the elements after Dequeue
        System.out.println("Removed Element : "+que.deQueue());
        que.display();
    }
}