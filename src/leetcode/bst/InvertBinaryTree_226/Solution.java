package leetcode.bst.InvertBinaryTree_226;


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
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
    private TreeNode invert(TreeNode root) {
        if (root == null) return root;
        var right = invert(root.left);
        var left = invert(root.right);
        root.left = left;
        root.right = right;
        return root;
    }
}
