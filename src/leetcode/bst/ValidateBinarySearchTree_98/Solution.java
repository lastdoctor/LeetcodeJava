package leetcode.bst.ValidateBinarySearchTree_98;


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
    public boolean isValidBST(TreeNode root) {
        return inOrder(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean inOrder(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (min >= root.val || root.val >= max) return false;
        return inOrder(root.left, min, root.val)  && inOrder(root.right, root.val, max);
    }
}