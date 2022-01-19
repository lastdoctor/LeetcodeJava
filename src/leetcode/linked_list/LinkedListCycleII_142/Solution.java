package leetcode.linked_list.LinkedListCycleII_142;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        var set = new HashSet<ListNode>();
        var curr = head;
        while (curr != null) {
            if (set.contains(curr)) return curr;
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
