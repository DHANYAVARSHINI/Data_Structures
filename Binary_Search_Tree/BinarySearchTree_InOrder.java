import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int d){
        data = d;
        left = null; // Address of the left node
        right = null;// Address of the left node
    }
}

class BinarySearch{
    TreeNode root = null;
    
    // Method to insert the node in to the tree
    void insert(int d){
        root = insert(root, d);
    }
    TreeNode insert(TreeNode curr, int d){
        if(curr == null){
            TreeNode node = new TreeNode(d);
            return node; // Returns the address of the node
        }
        if(curr.data > d){ // If the data is less than the current node
            curr.left = insert(curr.left, d);
        }
        else{// If the data is greater than the current node
            curr.right = insert(curr.right, d);
        }
        return curr;
    }
    
    // Method for get the output in inorder form
    void in_order(){
        in_order(root);
    }
    
    void in_order(TreeNode curr){
        if(curr == null){
            return;
        }
        in_order(curr.left);
        System.out.print(curr.data+" ");
        in_order(curr.right);
    }
}

// Main Class
class BinarySearchTree_InOrder{
    public static void main(String args[]){
        BinarySearch bst = new BinarySearch();
        
        // Inserting the Datas in the tree
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        
        // Displaying the data in the in-ordered form
        bst.in_order();
        System.out.println();
    }
}