package com.company.linked_list.RemoveDuplicatesFromSortedList_83;


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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                ListNode next = cur.next.next;
                cur.next = next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}