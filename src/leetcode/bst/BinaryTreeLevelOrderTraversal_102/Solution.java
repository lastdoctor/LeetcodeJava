package leetcode.bst.BinaryTreeLevelOrderTraversal_102;


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return res;
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> t = new ArrayList<>();
            int levelNum = queue.size();

            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }

                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                t.add(queue.poll().val);
            }
            res.add(t);

        }
        return res;
    }
}
