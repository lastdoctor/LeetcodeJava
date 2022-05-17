package leetcode.tree._1379;

import java.util.*;

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

class Solution2 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        var originalQ = new LinkedList<TreeNode>();
        originalQ.addFirst(original);

        var clonedQ = new LinkedList<TreeNode>();
        clonedQ.addFirst(cloned);

        while (!originalQ.isEmpty()) {
            TreeNode currNodeOriginal = originalQ.removeLast();
            TreeNode currNodeCloned = clonedQ.removeLast();

            if (currNodeOriginal == target) return currNodeCloned;

            if (currNodeOriginal.left != null) originalQ.addFirst(currNodeOriginal.left);
            if (currNodeOriginal.right != null) originalQ.addFirst(currNodeOriginal.right);
            if (currNodeCloned.left != null) clonedQ.addFirst(currNodeCloned.left);
            if (currNodeCloned.right != null) clonedQ.addFirst(currNodeCloned.right);
        }

        return null;
    }
}
