package com.company.linked_list.SwappingNodesInALinkedList_1721;


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

// Time O(n) Space O(1)
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, slow = head, fNode = head, sNode = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        fNode = fast;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        sNode = slow;

//        swap Node val
        int temp = fNode.val;
        fNode.val = sNode.val;
        sNode.val = temp;

        return head;
    }
}
