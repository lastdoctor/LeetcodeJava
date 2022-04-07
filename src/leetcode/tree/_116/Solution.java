package leetcode.tree._116;


import java.util.LinkedList;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        var q = new LinkedList<Node>();
        q.addFirst(root);

        while (!q.isEmpty()) {
            int levelNum = q.size();

            for (int i = 0; i < levelNum; i++) {
                Node curr = q.removeLast();
                if (levelNum - 1 == i) {
                    curr.next = null;
                } else {
                    curr.next = q.peekLast();
                }

                if (curr.left != null) {
                    q.addFirst(curr.left);
                }
                if (curr.right != null) {
                    q.addFirst(curr.right);
                }
            }
        }

        return root;
    }
}
