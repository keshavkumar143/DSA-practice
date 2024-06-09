//Same Tree
// LEETCODE LINK ==> https://leetcode.com/problems/same-tree/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        
        if (p == null || q == null) {
            return false;
        }
        
        if (p.val != q.val) {
            return false;
        }
        
        boolean leftSubtrees = isSameTree(p.left, q.left);
        boolean rightSubtrees = isSameTree(p.right, q.right);
        
        return leftSubtrees && rightSubtrees;
    }
}

public class ques7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        
        boolean result = solution.isSameTree(tree1, tree2);
        
        System.out.println(result);
    }
}
