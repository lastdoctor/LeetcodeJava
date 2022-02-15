package leetcode.tree.MaximumDepthofBinaryTree_104;

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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        var q = new LinkedList<TreeNode>();
        q.addLast(root);

        int ans = 0;
        while (!q.isEmpty()) {
            int levelNum = q.size();
            while (levelNum > 0) {
                var cur = q.removeFirst();
                if (cur == null) continue;
                if (cur.left != null) q.addLast(cur.left);
                if (cur.right != null) q.addLast(cur.right);
                levelNum--;
            }
            ans++;
        }
        return ans;
    }
}
