package leetcode.backtracking._257;

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
    void getTreePaths(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
            return;
        }
        var candidatePath = path + node.val + "->";

        if (node.left != null) getTreePaths(node.left, candidatePath, paths);
        if (node.right != null) getTreePaths(node.right, candidatePath, paths);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        var paths = new ArrayList<String>();
        getTreePaths(root, "", paths);
        return paths;
    }
}
