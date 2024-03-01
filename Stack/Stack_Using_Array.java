class Stack{
    static int top = 0, size  = 6;
    int st[] = new int[size];
    
    // Method to check the stack is full or not
    boolean isFull(){
        return top == size;
    }
    
    // Method for push the element in the stack
    void push(int d){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            st[top] = d;
            top++;
        }
    }
    
    // Method to check the stack is empty or not
    boolean isEmpty(){
        return top == 0;
    }
    
    // Method for pop the element from the stack
    int pop(){    
        int val = -1;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            val = st[top];
        }
        return val;
    }
    
    // Method for getting the top value in the stack
    int peek(){
        int val = -1;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            
            val = st[top - 1];
        }
        return val;
    }
    void display(){
        for(int i = top-1; i >= 0; i--){
            System.out.println(st[i]);
        }
    }
}

// Main class
class Stack_Using_Array{
    public static void main(String args[]){
        Stack s = new Stack();
        // Displaying the stack is full or not
        System.out.println(s.isFull());
        System.out.println();
        
        // Displaying the pushed elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println();
        
        // Displaying the stack is empty or not
        System.out.println(s.isEmpty());
        
        // Displaying the poped element
        System.out.println("\nThe poped element is "+s.pop());
        
        // Displaying the peek element
        System.out.println("\nThe peek element is "+s.peek());
        
    }
}