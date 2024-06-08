// Definition for a binary tree node.
//BALANCED BINARY TREE 
// LEETCODE LINK --> https://leetcode.com/problems/balanced-binary-tree/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    boolean flag = true; 

    public int num(TreeNode root) { 
        if (root == null || !flag) { 
            return 0; 
        }

        int a = num(root.right);
        int b = num(root.left); 
        int k = Math.abs(a - b); 

        if (k > 1) {
            flag = false; 
        }

        return Math.max(a + 1, b + 1); 
    }

    public boolean isBalanced(TreeNode root) {
        num(root); 
        return flag; 
    }
}

public class ques6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        Solution solution = new Solution();
        boolean result = solution.isBalanced(root);

        System.out.println(result);
    }
}
