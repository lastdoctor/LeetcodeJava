package leetcode.tree.FindAllTheLonelyNodes_1469;

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
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {
        inorder(root, false);
        return list;
    }

    private void inorder(TreeNode root, Boolean isLonely) {
        if (root == null) return;
        inorder(root.left, root.right == null);
        if (isLonely) list.add(root.val);
        inorder(root.right, root.left == null);
    }
}

class Solution1 {
    public List<Integer> getLonelyNodes(TreeNode root) {
        var st = new LinkedList<TreeNode>();
        var list = new ArrayList<Integer>();

        st.push(root);
        while (!st.isEmpty()) {
            var node = st.poll();
            if (node == null) continue;

            if (node.left != null) {
                st.push(node.left);
                if (node.right == null) {
                    list.add(node.left.val);
                }
            }

            if (node.right != null) {
                st.push(node.right);
                if (node.left == null) {
                    list.add(node.right.val);
                }
            }
        }

        return list;
    }
}

class Solution2 {
    public List<Integer> getLonelyNodes(TreeNode root) {
        var st = new Stack<TreeNode>();
        var list = new ArrayList<Integer>();

        st.add(root);
        while (!st.isEmpty()) {
            var node = st.pop();
            if (node == null) continue;

            if (node.left != null) {
                st.add(node.left);
                if (node.right == null) {
                    list.add(node.left.val);
                }
            }

            if (node.right != null) {
                st.add(node.right);
                if (node.left == null) {
                    list.add(node.right.val);
                }
            }
        }

        return list;
    }
}