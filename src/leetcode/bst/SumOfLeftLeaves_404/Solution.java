package leetcode.bst.SumOfLeftLeaves_404;


import java.util.Stack;

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
    private int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        inorder(root);
        return ans;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (root.left != null
                && root.left.left == null
                && root.left.right == null
        ) ans += root.left.val;
        inorder(root.right);
    }
}

class Solution1 {
    public int sumOfLeftLeaves(TreeNode root) {
        var st = new Stack<TreeNode>();
        st.add(root);
        var ans = 0;
        while(!st.isEmpty()) {
            var node = st.pop();
            if (node == null) continue;
            if (node.left != null
                    && node.left.left == null
                    && node.left.right == null
            ) ans += node.left.val;
            st.add(node.left);
            st.add(node.right);
        }

        return ans;
    }
}