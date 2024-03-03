class Queue{
    static int size = 7, front = 0, rear = 0;
    int q[] = new int[size];
    
    // Method to check whether the Queue is full or not
    boolean isFull(){
        return rear == size;
    }
    
    // Method for Enqueueing the elements
    void enQueue(int d){
        if(isFull()){
             System.out.println("Queue is Full");
        }
        else{
            q[rear] = d;
            rear++;
        }
    }
    
    // Method to check whether the Queue is empty or not
    boolean isEmpty(){
        return rear == 0;
    }
    
    // Method for Dequeing the elements
    int deQueue(){
        if(isEmpty()){
            // System.out.println("Queue is Empty");
            return -1;
        }
        int val = q[front];
        for(int i = 1; i <= rear-1; i++){
            q[i-1] = q[i];
        }
        rear--;
        q[rear] = 0;
        return val;
    }
    
    // Method for displaying the elements
    void display(){
        for(int i = 0; i < rear; i++){
        System.out.print(q[i]+" ");
        }
        System.out.println();
    }
}

// Main class
class Queue_Using_Arrays{
    public static void main(String args[]){
        Queue que = new Queue();
        // Displaying the Enqueueing elements
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.enQueue(40);
        que.enQueue(50);
        que.enQueue(60);
        que.enQueue(70);
        que.display(); //10 20 30 40 50 60 70 
        
        // Displaying the elements after Dequeue
        System.out.println("Removed Element : "+que.deQueue()); //Removed Element : 10
        que.display();  //20 30 40 50 60 70 
        System.out.println("Removed Element : "+que.deQueue()); //Removed Element : 20 
        que.display(); //30 40 50 60 70
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        System.out.println(que.deQueue()); //-1
        
        
    }
}