import java.util.*;
class treeNode{
    int data;
    treeNode left; //address of left child
    treeNode right; //address of right child
    public treeNode(int d){
        data=d;
        left=null;
        right=null;
    }
}

class BinaryTree{
    treeNode root=null;//assigning the node as the root node
    void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int val=sc.nextInt();
        if(val!=-1){
            treeNode node=new treeNode(val);//root node
            root=node;
            insert(node);//recursive call to insert()
        }
    }
    
    //Method to insert values to left and right side to the current node
    void insert(treeNode curr){
        Scanner sc=new Scanner(System.in);
        
        //to insert left side of the node
        System.out.println("Enter the left value of "+curr.data+" ");
        int left_val=sc.nextInt();
        if(left_val!=-1){
            treeNode node=new treeNode(left_val);
            curr.left=node;
            insert(curr.left);
        }
        
        //to insert right side of the node
        System.out.println("Enter the right value of "+curr.data+" ");
        int right_val=sc.nextInt();
        if(right_val!=-1){
            treeNode node=new treeNode(right_val);
            curr.right=node;
            insert(curr.right);
        }
    }
    
    //Method for level order tree traversal
    void level_order(){
        Queue<treeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            treeNode curr=que.remove();
            System.out.print(curr.data+ " ");
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }
    }
}

public class BinaryTree_LevelOrder{
    public static void main(String args[]){
        BinaryTree bt=new BinaryTree();
        bt.insert();
        
        // Displaying the level ordered values
        bt.level_order();
    }
}