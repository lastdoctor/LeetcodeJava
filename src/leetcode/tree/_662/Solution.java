package leetcode.tree._662;

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
    public int widthOfBinaryTree(TreeNode root) {
        var map = new HashMap<TreeNode, Integer>();
        var q = new LinkedList<TreeNode>();

        map.put(root, 1);
        q.addFirst(root);
        int maxW = 0, curW = 0;

        while (!q.isEmpty()) {
            int levelNum = q.size();
            int start = 0, end = 0;

            for (int i = 0; i < levelNum; i++) {
                TreeNode cur = q.removeLast();
                if (i == 0) {
                    start = map.get(cur);
                }
                if (i == levelNum - 1) {
                    end = map.get(cur);
                }
                if (cur.left != null) {
                    map.put(cur.left, map.get(cur) * 2);
                    q.addFirst(cur.left);
                }
                if (cur.right != null) {
                    map.put(cur.right, map.get(cur) * 2 + 1);
                    q.addFirst(cur.right);
                }
            }

            curW = end - start + 1;
            maxW = Math.max(curW, maxW);
        }

        return maxW;
    }
}
