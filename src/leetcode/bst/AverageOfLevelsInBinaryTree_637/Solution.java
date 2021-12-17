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
        q.add(root);
        while (!q.isEmpty()) {
            var levelNum = q.size();
            for (var i = 0; i < levelNum; i++) {
                var node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            list.add(sum / levelNum);
            sum = 0;
        }

        return list;
    }
}


