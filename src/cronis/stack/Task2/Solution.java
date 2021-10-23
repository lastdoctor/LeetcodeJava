package cronis.stack.Task2;

import java.util.Arrays;

class Stack {
    private int stackSize = 0;
    private int stackTop = -1;
    private int arrSize = 5;
    private int[] stack = new int[arrSize];

    void push(int value) {
        if (stackSize == arrSize) {
            new Stack1().push(value);
        } else {
            stack[stackSize] = value;
            stackSize++;
            stackTop++;
            System.out.println(stackTop);
        }
    }

    int pop() {
        if (stackSize == arrSize) {
            return new Stack1().pop();
        } else {
            int value = stack[stackTop];
            stackSize--;
            stackTop--;
            return value;
        }
    }

    int peek() {
        if (stackSize == arrSize) return new Stack1().peak();
        else return stack[stackTop];
    }

    int size() {
        if (stackSize == arrSize) return stackSize;
        else return stackSize + new Stack().size();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackSize=" + stackSize +
                ", stackTop=" + stackTop +
                ", arrSize=" + arrSize +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}

class Stack1 {
    private int stackSize = 0;
    private int stackTop = -1;
    private int arrSize = 5;
    private int[] stack = new int[arrSize];

    void push(int value) {
        stack[stackSize] = value;
        stackSize++;
        stackTop++;
        System.out.println(stackTop);
    }

    int peak() {
        return stack[stackTop];
    }

    int pop() {
        int value = stack[stackTop];
        stackSize--;
        stackTop--;
        return value;
    }
}

class Solution {
    public static void main(String... args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
//        System.out.println(st.peek());
    }
}
