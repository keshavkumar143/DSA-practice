import java.util.*;
//Preorder , inorder , postorder Traversal of a tree

//Preoder Leetcode Link --> https://leetcode.com/problems/binary-tree-preorder-traversal/
//Inorder Leetcode Link --> https://leetcode.com/problems/binary-tree-inorder-traversal/
//Post Order Leetcode Link --> https://leetcode.com/problems/binary-tree-postorder-traversal/

class Node {
    int data; 
    Node left; 
    Node right; 

    Node(int data) {
        this.data = data; 
        this.left = null; 
        this.right = null; 
    }
}

class BinaryTree {
    static int idx = -1; 

    public static Node buildTree(int nodes[]) {
        idx++; 
        if (nodes[idx] == -1) {
            return null; 
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes); 
        newNode.right = buildTree(nodes); 

        return newNode;
    }
}


public class ques25 {
    
    public static void preorder(Node root){

        if(root == null){
            return; 
        }
        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right); 

    }


    public static void inorder(Node root){
        if(root == null){
            return; 
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root == null){
            return; 
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // preorder(root); //1,2,4,5,3,6
        // inorder(root); //4,2,5,1,3,6
        // postorder(root); //4,5,2,6,3,1
    }
}
