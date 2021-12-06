package leetcode.bst.TwoSumIVInputIsABST_653;

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
    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int target) {
        return inOrder(root, target);
    }

    private boolean inOrder(TreeNode root, int target) {
        if (root == null) return false;
        if (set.contains(target - root.val)) return true;
        set.add(root.val);
        return inOrder(root.left, target) || inOrder(root.right, target);
    }
}

class Solution1 {
    public boolean findTarget(TreeNode root, int k) {
        var set = new HashSet<Integer>();
        var q = new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()) {
            var node = q.poll();
            if (node == null) continue;
            if (set.contains(k - node.val)) return true;
            set.add(node.val);

            q.add(node.left);
            q.add(node.right);
        }

        return false;
    }
}