package leetcode.bst.SumOfLeftLeaves_404;


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
    private int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        inorder(root);
        return ans;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (root.left != null
                && root.left.left == null
                && root.left.right == null
        ) ans += root.left.val;
        inorder(root.right);
    }
}