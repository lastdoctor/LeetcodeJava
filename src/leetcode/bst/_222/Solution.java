package leetcode.bst._222;


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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        ans += countNodes(root.left);
        ans += 1;
        ans += countNodes(root.right);
        return ans;
    }
}
