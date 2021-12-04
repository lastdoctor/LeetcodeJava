package leetcode.bst.ConvertSortedArrayToBinarySearchTree_108;


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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createNode(nums, 0, nums.length - 1);
    }

    private TreeNode createNode(int[] nums, Integer l, Integer r) {
        if (l > r) return null;
        var m = (r + l) >> 1;
        var root = new TreeNode(nums[m]);
        root.left = createNode(nums, l, m - 1);
        root.right = createNode(nums, m + 1, r);
        return root;
    }
}
