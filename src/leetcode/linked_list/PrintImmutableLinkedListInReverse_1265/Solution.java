package leetcode.linked_list.PrintImmutableLinkedListInReverse_1265;

import java.util.Stack;

/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 * public void printValue(); // print the value of this node.
 * public ImmutableListNode getNext(); // return the next node.
 * };
 */

class ImmutableListNode {
    public ImmutableListNode getNext() {
        return new ImmutableListNode();
    }

    public void printValue() {
    }
}

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head.getNext() != null) {
            printLinkedListInReverse(head.getNext());
        }
        head.printValue();
    }
}

class Solution1 {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> st = new Stack<>();
        ImmutableListNode temp = head;
        while (temp != null) {
            st.add(temp);
            temp = temp.getNext();
        }

        while (!st.isEmpty()) {
            ImmutableListNode node = st.pop();
            node.printValue();
        }
    }
}