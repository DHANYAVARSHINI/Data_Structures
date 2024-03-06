import java.util.Scanner;

class treeNode{
    int data;
    treeNode left; //address of left child
    treeNode right; //address of right child
    public treeNode(int d){
        data = d;
        left = null;
        right = null;
    }
}

class Binary{
    treeNode root = null;
    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int val = sc.nextInt();
        if(val != -1){
            treeNode node = new treeNode(val);
            root = node;
            insert(root);
        }
    }
    void insert(treeNode curr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the left value of "+curr.data+": ");
        int left_val = sc.nextInt();
        if(left_val !=-1){
            treeNode node = new treeNode(left_val);
            curr.left = node;
            insert(curr.left);
        }
        System.out.println("Enter the right value of "+curr.data+": ");
        int right_val = sc.nextInt();
        if(right_val !=-1){
            treeNode node = new treeNode(right_val);
            curr.right = node;
            insert(curr.right);
        }
    }
    // Method for In-Order Tree Traversal
    void in_order(){
        in_order(root);
    }
    void in_order(treeNode curr){
        if(curr == null){
            return;
        }
        in_order(curr.left);
        System.out.print(curr.data+" ");
        in_order(curr.right);
    }
}

// Main class
class BinaryTree_InOrder{
    public static void main(String args[]){
        Binary bt = new Binary();
        
        // Displaying the Inserting nodes
        bt.insert();
        
        // Displaying the In_Ordered Traversal
        bt.in_order();
        System.out.println();
    }
}