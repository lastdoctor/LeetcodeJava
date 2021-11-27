package leetcode.linked_list.ReverseLinkedList_206;


//  Definition for singly-linked list.
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

// Space O(n) Time O(n);
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode reversed = null;
        while (head != null) {
            ListNode headNext = head.next;
            head.next = reversed;
            reversed = head;
            head = headNext;
        }

        return reversed;
    }
}