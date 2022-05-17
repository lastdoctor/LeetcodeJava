package leetcode.tree._1379;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {
    TreeNode inorder(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original == null) return null;

        if (original == target) {
            return cloned;
        }

        TreeNode left = inorder(original.left, cloned.left, target);
        TreeNode right = inorder(original.right, cloned.right, target);
        if (left != null) return left;
        return right;
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return inorder(original, cloned, target);
    }
}
