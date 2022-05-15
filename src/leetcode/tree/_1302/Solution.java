package leetcode.tree._1302;


import java.util.LinkedList;

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
    public int deepestLeavesSum(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        q.addFirst(root);

        int sum = 0;
        while (!q.isEmpty()) {
            int levelNum = q.size();
            if (levelNum != 0) sum = 0;
            for (int i = 0; i < levelNum; i++) {
                TreeNode currNode = q.removeLast();
                sum += currNode.val;
                if (currNode.right != null) q.addFirst(currNode.right);
                if (currNode.left != null) q.addFirst(currNode.left);
            }
        }

        return sum;
    }
}
