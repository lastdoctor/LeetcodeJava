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

class Solution1 {
    public ListNode detectCycle(ListNode head) {
        var fast = head;
        var slow = head;
        do {
            if (fast == null || fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
