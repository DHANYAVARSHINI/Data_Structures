class Node{
    int data;
    Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}
class Stack{
    Node top = null;
    static int size = 0;
    
    // Method to perform Push Operation
    void push(int d){
        Node node = new Node(d);
        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
        size++;
    }
    
    // Method to perform isEmpty Operation
    boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    
    // Method to perform Pop Operation
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }
    
    // Method to perform Peek Operation
    int peek(){
        if(isEmpty()){
            return -1;
        }
        int val = top.data;
        return val;
    }
    
    // Method to perform Display Operation
    void display(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
class Stack_Using_LinkedList{
    public static void main(String args[]){
        Stack st = new Stack();
        // Displaying the pushed elements
        st.push(12);
        st.push(22);
        st.push(32);
        st.push(42);
        st.display();
        
        // Checking the stack is empty or not
        System.out.println(st.isEmpty());
        System.out.println();
        
        //  Displaying the poped element
        System.out.println("The poped element is "+st.pop());
        System.out.println();
        
        // Displaying the peek value(Top value in the stack)
        System.out.println("The Top element in the stack is "+st.peek());
        System.out.println();
    }
}