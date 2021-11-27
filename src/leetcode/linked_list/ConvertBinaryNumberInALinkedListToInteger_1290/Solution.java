package leetcode.linked_list.ConvertBinaryNumberInALinkedListToInteger_1290;


// Definition for singly-linked list.
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
// Space O(1) Space O(n)
// Binary Representation
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = head.val;
        while(head.next != null) {
            ans = ans * 2 + head.next.val;
            head = head.next;
        }

        return ans;
    }
}
// Space O(1) Space O(n)
// Bit Manipulation
class Solution1 {
    public int getDecimalValue(ListNode head) {
        int ans = head.val;

        while(head.next != null) {
            ans = ans << 1;
            ans = ans | head.next.val;
            head = head.next;
        }

        return ans;
    }
}
