package cronis.stack.Task3;

import com.company.stack.MinStack_155.MinStack1;

import java.util.Arrays;

abstract class Stack {
    private int size = 0;
    private int top = -1;
    private final int arrSize = 10;
    private int[] stack = new int[arrSize];

    private class Node {
        int value;
        Stack.Node next;

        private Node(int val, int min, Stack.Node next) {
            this.value = val;
            this.next = next;
        }
    }


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

}

class Stack2 extends Stack {

}

class Stack3 extends Stack {

}

class Solution {
    public static void main(String... args) throws Exception {
        Stack1 st1 = new Stack1();
        Stack2 st2 = new Stack2();
        Stack3 st3 =new Stack3();

        st1.push(1);
        st2.push(2);
        st3.push(3);

        System.out.println(st1);
    }
}