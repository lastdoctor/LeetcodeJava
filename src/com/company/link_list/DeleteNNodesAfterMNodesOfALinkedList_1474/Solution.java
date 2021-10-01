package com.company.link_list.DeleteNNodesAfterMNodesOfALinkedList_1474;


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

// Space O(n) Time O(1)
class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode lastMNode = head;
        while (currentNode != null) {
            // Initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            // traverse m nodes
            while (currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            }
            // traverse n nodes
            while (currentNode != null && nCount != 0) {
                currentNode = currentNode.next;
                nCount--;
            }
            // delete n nodes
            lastMNode.next = currentNode;
        }
        return head;
    }
}
