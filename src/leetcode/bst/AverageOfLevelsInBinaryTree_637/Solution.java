package leetcode.bst.AverageOfLevelsInBinaryTree_637;

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
    public List<Double> averageOfLevels(TreeNode root) {
        var list = new ArrayList<Double>();
        var q = new LinkedList<TreeNode>();
        double sum = 0;
        q.addLast(root);
        while (!q.isEmpty()) {
            var levelNum = q.size();
            for (var i = 0; i < levelNum; i++) {
                var node = q.removeFirst();
                sum += node.val;
                if (node.left != null) q.addLast(node.left);
                if (node.right != null) q.addLast(node.right);
            }
            list.add(sum / levelNum);
            sum = 0;
        }

        return list;
    }
}


