package leetcode.bst.SearchInABinarySearchTree_700;


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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        return (val < root.val) ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}

class Solution1 {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;
            else if (root.val > val) root = root.left;
            else root = root.right;
        }
        return null;
    }
}