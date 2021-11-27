package leetcode.stack.MinStack_155;

import java.util.*;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {
    private List<Integer> stack = new ArrayList();
    private List<Integer> stackWithMins = new ArrayList();

    public MinStack() {
    }

    public void push(int val) {
        if (stackWithMins.isEmpty()) {
            stackWithMins.add(val);
        } else if (val <= stackWithMins.get(stackWithMins.size() - 1)) {
            stackWithMins.add(val);
        }

        stack.add(val);
    }

    public void pop() {
        int poppedValue = stack.remove(stack.size() - 1);
        int minValue = stackWithMins.get(stackWithMins.size() - 1);

        if (poppedValue == minValue) {
            stackWithMins.remove(stackWithMins.size() - 1);
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return stackWithMins.get(stackWithMins.size() - 1);
    }
}
// TODO `Learn`
class MinStack1 {
    private Node head;

    public void push(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}