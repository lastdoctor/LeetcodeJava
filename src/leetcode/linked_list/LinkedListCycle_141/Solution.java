package leetcode.linked_list.LinkedListCycle_141;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
// Time complexity O(n) Space complexity O(1)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
// Time complexity O(n) Space complexity O(n)
class Solution1 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        var set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }
}