package leetcode.linked_list.MergeTwoSortedLists_21;


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

// Time complexity O(n + m) space complexity O(n +m)
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

// Time complexity O(n+m) Space O(1);
class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);

        ListNode ansCopy = ans;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ansCopy.next = l1;
                l1 = l1.next;
            } else {
                ansCopy.next = l2;
                l2 = l2.next;
            }

            ansCopy = ansCopy.next;
        }

        if (l1 == null) ansCopy.next = l2;
        else ansCopy.next = l1;

        return ans.next;
    }
}