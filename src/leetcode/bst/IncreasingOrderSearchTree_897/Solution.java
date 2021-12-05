package leetcode.bst.IncreasingOrderSearchTree_897;


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
    private TreeNode ans = null;
    private TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (ans == null) {
            ans = root;
        } else {
            prev.right = root;
        }
        prev = root;
        root.left = null;
        inOrder(root.right);
    }
}

class Solution1 {
    private TreeNode curr = null;
    public TreeNode increasingBST(TreeNode root) {
        var dummy = new TreeNode(-1);
        curr = dummy;
        inOrder(root);
        return dummy.right;
    }
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        curr.right = new TreeNode(node.val);
        curr = curr.right;
        inOrder(node.right);
    }
}
