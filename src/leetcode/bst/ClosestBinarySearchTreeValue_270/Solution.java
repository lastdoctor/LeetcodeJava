package leetcode.bst.ClosestBinarySearchTreeValue_270;


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
    private int prev;

    public int closestValue(TreeNode root, double target) {
        prev = root.val;
        find(root, target);
        return prev;
    }

    private void find(TreeNode root, double target) {
        if (root == null) return;
        find(root.left, target);
        if (Math.abs(target - root.val) < Math.abs(target - prev)) {
            prev = root.val;
        }
        find(root.right, target);
    }
}

class Solution1 {
    public int closestValue(TreeNode root, double target) {
        int prev = root.val;

        while(root != null) {
            if (Math.abs(target - root.val) < Math.abs(target-prev)) {
                prev = root.val;
            }
            if (target > root.val) root = root.right;
            else root = root.left;
        }
        return prev;
    }
}