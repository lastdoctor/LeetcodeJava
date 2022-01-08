package leetcode.bst.LowestCommonAncestorofaBinarySearchTree_235;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {
    private TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode r1, TreeNode r2) {
        return dfs(root, r1, r2);
    }

    private TreeNode dfs(TreeNode root, TreeNode r1, TreeNode r2) {
        if (root == null) return null;
        if (r1.val < root.val && r2.val < root.val) return dfs(root.left, r1, r2);
        else if (r1.val > root.val && r2.val > root.val) return dfs(root.right, r1, r2);
        else return root;
    }
}
