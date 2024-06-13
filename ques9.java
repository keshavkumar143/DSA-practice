//Invert Tree
// LEETCODE link --> https://leetcode.com/problems/invert-binary-tree/description/

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

class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
}

public class ques9 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, 
                            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                            new TreeNode(7, new TreeNode(6), new TreeNode(9))
                        );

        InvertTree invertTree = new InvertTree();
        TreeNode invertedRoot = invertTree.invertTree(root);

        printTree(invertedRoot);
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }
}
