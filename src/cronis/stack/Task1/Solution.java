package cronis.stack.Task1;

import java.util.Arrays;

class Stack {
    private int top = -1;
    private int size = 0;
    private int arrSize = 10;
    private int[] STACK = new int[arrSize];


    void push(int value) throws Exception {
        if (top == arrSize - 1) throw new Exception("Stack overflow");
        top++;
        STACK[top] = value;
        size++;
    }

    int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        int value = STACK[top];
        size--;
        top--;
        return value;
    }

    int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        return STACK[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", size=" + size +
                ", arrSize=" + arrSize +
                ", STACK=" + Arrays.toString(STACK) +
                '}';
    }
}

class Solution {
    public static void main(String... args) throws Exception {
        Stack unsorted = new Stack();
        Stack sorted = new Stack();
        unsorted.push(7);
        unsorted.push(9);
        unsorted.push(5);

        sorted.push(3);
        sorted.push(6);
        sorted.push(8);

        Solution s = new Solution();
        s.sort(unsorted, sorted);

        Stack st1 = new Stack();
        Stack st2 = new Stack();
        st1.push(1);
        st1.push(5);
        st1.push(0);
        st1.push(-60);
        st1.push(20);
        s.sort(st1, st2);
    }

    private void sort (Stack unsorted, Stack sorted) throws Exception {
        while (!unsorted.isEmpty()) {
            int temp = 0;
            if (!sorted.isEmpty()) temp = unsorted.pop();
            while (!sorted.isEmpty() && sorted.peek() > temp) {
                unsorted.push(sorted.pop());
            }
            sorted.push(temp);
        }

        System.out.println(sorted);
    }
}