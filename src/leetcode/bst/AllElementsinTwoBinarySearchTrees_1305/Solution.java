package leetcode.bst.AllElementsinTwoBinarySearchTrees_1305;

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
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        dfs(root1);
        dfs(root2);
        Collections.sort(ans);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        ans.add(root.val);
        dfs(root.right);
    }
}

// 29/53
class Solution1 {
    LinkedList<Integer> unsorted = new LinkedList<>();
    LinkedList<Integer> sorted = new LinkedList<>();

    private void dfs(TreeNode root) {
        if (root == null)return;
        dfs(root.left);
        unsorted.addLast(root.val);
        dfs(root.right);
    }

    private void moveElementBiggerTemp(LinkedList<Integer> unsorted, LinkedList<Integer> sorted, int temp) {
        while (!sorted.isEmpty() && sorted.peekLast() > temp)
            unsorted.addLast(sorted.removeLast());
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        dfs(root1);
        dfs(root2);

        while (!unsorted.isEmpty()) {
            int temp = unsorted.removeLast();
            moveElementBiggerTemp(unsorted, sorted, temp);
            sorted.addLast(temp);
        }
        return sorted;
    }
}

class Solution2 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        var ans = new ArrayList<Integer>();
        var st1 = new LinkedList<TreeNode>();
        var st2 = new LinkedList<TreeNode>();

        while (!st1.isEmpty() || !st2.isEmpty() || root1 != null || root2 != null) {
            while (root1 != null) {
                st1.addLast(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                st2.addLast(root2);
                root2 = root2.left;
            }

            if (st2.isEmpty() || (!st1.isEmpty() && st1.peekLast().val < st2.peekLast().val && !st2.isEmpty())) {
                var node1 = st1.removeLast();
                ans.add(node1.val);
                root1 = node1.right;
            } else {
                var node2 = st2.removeLast();
                ans.add(node2.val);
                root2 = node2.right;
            }
        }
        return ans;
    }
}
