package leetcode.linked_list._2;


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(-1);
        ListNode sumNode = fake;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int currSum = 0;
            if (l1 != null) {
                currSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currSum += l2.val;
                l2 = l2.next;
            }
            int lastDigit = (currSum + carry) % 10;
            carry = (currSum + carry) / 10;

            sumNode.next = new ListNode(lastDigit);

            sumNode = sumNode.next;
        }


        return fake.next;
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(-1);
        ListNode sumNode = fake;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int currSum = 0;
            if (l1 != null) {
                currSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currSum += l2.val;
                l2 = l2.next;
            }
            int lastDigit = (currSum + carry) % 10;
            carry = (currSum + carry) / 10;
            ;

            sumNode.next = new ListNode(lastDigit);

            sumNode = sumNode.next;
        }

        if (carry != 0) {
            sumNode.next = new ListNode(carry);
        }
        return fake.next;
    }
}


class Solution3 {
    void addNums(ListNode l1, ListNode l2, ListNode sumNode, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return;
        }
        int sum = carry;
        sum += (l1 != null) ? l1.val : 0;
        sum += (l2 != null) ? l2.val : 0;

        int lastDigit = sum % 10;
        carry = sum / 10;
        sumNode.next = new ListNode(lastDigit);
        sumNode = sumNode.next;

        if (l1 != null) {
            l1 = l1.next;
        }
        if (l2 != null) {
            l2 = l2.next;
        }

        addNums(l1, l2, sumNode, carry);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(-1);
        ListNode sumNode = fake;
        addNums(l1, l2, sumNode, 0);
        return fake.next;
    }
}
