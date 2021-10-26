package cronis.stack.Task3;

import java.util.*;

abstract class Stack {
    private int size = 0;
    private int top = -1;
    private final int arrSize = 10;
    private int[] stack = new int[arrSize];

    void push(int value) throws Exception {
        if (size == arrSize) throw new Exception("Stack is overflow");
        stack[size] = value;
        size++;
        top++;
    }

    int pop() throws Exception {
        if (top == -1) throw new Exception("Stack is empty");
        int value = stack[size];
        size--;
        top--;
        return value;
    }

    int peak() throws Exception {
        if (top == -1) throw new Exception("Stack is empty");
        return stack[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", top=" + top +
                ", arrSize=" + arrSize +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}

class Stack1 extends Stack {
    int[] stack;
    public Stack1(int[] stack) {
        this.stack = stack;
    }
}

class Stack2 extends Stack {
    int[] stack;
    public Stack2(int[] stack) {
        this.stack = stack;
    }
}

class Stack3 extends Stack {
    int[] stack;
    public Stack3(int[] stack) {
        this.stack = stack;
    }
}

class Solution {
    public static void main(String... args) throws Exception {
        int[] stack = new int[10];
        Stack1 st1 = new Stack1(stack);
        Stack2 st2 = new Stack2(stack);
        Stack3 st3 =new Stack3(stack);

        st1.push(1);
        st2.push(2);
        st3.push(3);

        System.out.println(st1);
    }
}