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

class Solution2 {
    int height = 0;
    int maxHeight = Integer.MIN_VALUE;
    int sum = 0;

    void inorder(TreeNode root, int currHeight) {
        if (root == null) return;
        currHeight += 1;
        inorder(root.left, currHeight);
        if (root.left == null && root.right == null) {
            if (currHeight > maxHeight) {
                maxHeight = currHeight;
                sum = root.val;
            } else if (maxHeight == currHeight) {
                sum += root.val;
            }
        }
        inorder(root.right, currHeight);
    }

    public int deepestLeavesSum(TreeNode root) {
        inorder(root, height);
        return sum;
    }
}
