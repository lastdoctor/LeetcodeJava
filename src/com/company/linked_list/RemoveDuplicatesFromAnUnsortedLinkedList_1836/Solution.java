package com.company.linked_list.RemoveDuplicatesFromAnUnsortedLinkedList_1836;


import java.util.HashMap;

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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode ans = new ListNode(-1);
        var map = new HashMap<Integer, Integer>();

        ListNode temp = head;
        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        temp = ans;
        while (head != null) {
            if (map.get(head.val) == 1) {
                temp.next = head;
                temp = temp.next;
            }

            head = head.next;
        }
        temp.next = null;
        return ans.next;
    }
}
