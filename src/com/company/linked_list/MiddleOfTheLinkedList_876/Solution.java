package com.company.linked_list.MiddleOfTheLinkedList_876;

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
    public int getLength(ListNode head) {
        int ans = 0;
        while (head != null) {
            head = head.next;
            ans++;
        }

        return ans;
    }

    public ListNode middleNode(ListNode head) {
        int len = getLength(head);
        ListNode p = head;
        for (int i = 0; i < len / 2; i++) {
            p = p.next;
        }

        return p;
    }
}

class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}