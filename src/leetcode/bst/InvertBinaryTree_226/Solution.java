package leetcode.bst.InvertBinaryTree_226;
import java.util.*;

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

class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        q.push(root);
        while(!q.isEmpty()) {
            var node = q.poll();
            if (node == null) continue;
            // swap
            var temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) q.push(node.left);
            if (node.right != null) q.push(node.right);
        }
        return root;
    }
}
