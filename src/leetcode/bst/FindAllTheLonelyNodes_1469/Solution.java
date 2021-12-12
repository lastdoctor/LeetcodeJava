package leetcode.bst.FindAllTheLonelyNodes_1469;

import java.util.*;

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
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {
        inorder(root, false);
        return list;
    }

    private void inorder(TreeNode root, Boolean isLonely) {
        if (root == null) return;
        inorder(root.left, root.right == null);
        if (isLonely) list.add(root.val);
        inorder(root.right, root.left == null);
    }
}
