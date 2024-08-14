import java.util.*;
//Pre order Traversal oa a tree
//Leetcode Link --> https://leetcode.com/problems/binary-tree-preorder-traversal/description/

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
    
    public static void preoder(Node root){

        if(root == null){
            return; 
        }
        System.out.print(root.data + " ");

        preoder(root.left);
        preoder(root.right); 

    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);

        preoder(root);
    }
}
