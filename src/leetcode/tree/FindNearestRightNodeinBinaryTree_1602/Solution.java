package leetcode.tree.FindNearestRightNodeinBinaryTree_1602;

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
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        var q = new LinkedList<TreeNode>();
        q.addLast(root);

        while (!q.isEmpty()) {
            var levelNum = q.size();
            var finded = false;
            for (int i = 0; i < levelNum; i++) {
                var node = q.removeFirst();
                if (node == null) continue;
                if (finded) return node;
                if (node == u) finded = true;
                q.add(node.left);
                q.add(node.right);
            }
            if (finded) return null;

        }
        return null;
    }
}
