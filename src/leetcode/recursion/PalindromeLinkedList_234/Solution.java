package leetcode.recursion.PalindromeLinkedList_234;

import java.util.ArrayList;
import java.util.Stack;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<>();

        ListNode hCopy = head;
        while (hCopy != null) {
            reverse.add(hCopy);
            hCopy = hCopy.next;
        }
        while (head != null) {
            ListNode popped = reverse.pop();
            if (popped.val != head.val) return false;
            head = head.next;
        }
        return true;
    }
}

class Solution1 {
    public boolean isPalindrome(ListNode head) {
        var stack = new ArrayList<ListNode>();
        ListNode c = head;
        while (c != null) {
            stack.add(c);
            c = c.next;
        }
        while (head != null) {
            ListNode pop = stack.remove(stack.size() - 1);
            if (pop.val != head.val) return false;
            head = head.next;
        }
        return true;
    }
}

class Solution2 {
    private ListNode front;
    private boolean check(ListNode curr) {
        if (curr != null) {
            if(!check(curr.next)) return false;
            if(curr.val != front.val) return false;
            front = front.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        front = head;
        return check(front);
    }
}