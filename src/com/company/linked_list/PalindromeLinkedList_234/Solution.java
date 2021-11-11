package com.company.linked_list.PalindromeLinkedList_234;

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
