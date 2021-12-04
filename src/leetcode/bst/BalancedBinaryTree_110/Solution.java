package leetcode.bst.BalancedBinaryTree_110;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = height(root.left);
        int r = height(root.right);

        return (Math.abs(l-r) < 2) &&
                isBalanced(root.left) &&
                isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}