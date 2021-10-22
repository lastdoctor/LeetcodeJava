package cronis.stack.Task1;


import java.util.Arrays;

class Stack {
    private int STACK_TOP = -1;
    private int stackSize = 0;
    private int STACK_SIZE = 5;
    private int[] STACK = new int[this.STACK_SIZE];




    void push(int value) throws Exception {
        if (this.STACK_TOP == this.STACK_SIZE - 1)
            throw new Exception("Stack overflow");
        this.STACK_TOP += 1;
        STACK[this.STACK_TOP] = value;
        this.stackSize++;
    }

    int pop() throws Exception {
        if (this.STACK_TOP == -1)
            throw new Exception("Stack is empty");
        int value = this.STACK[this.STACK_TOP];
        this.STACK_TOP--;
        this.stackSize--;
        return value;
    }

    int peek() throws Exception {
        if (this.STACK_TOP == -1)
            throw new Exception("Stack is empty");
        return this.STACK[this.STACK_TOP];
    }

    boolean isEmpty() {
        return this.STACK_TOP == -1;
    }

    int size() {
        return this.stackSize;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "STACK_TOP=" + STACK_TOP +
                ", STACK_SIZE=" + STACK_SIZE +
                ", STACK=" + Arrays.toString(STACK) +
                ", stackSize=" + stackSize +
                '}';
    }
}

class Solution {
    public static void main(String... args) throws Exception {
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        st1.push(1);
        st1.push(5);
        st1.push(0);
        st1.push(-60);
        st1.push(20);

        System.out.println("Unsorted stack :" + st1);
        System.out.println(st2);

        while (st1.isEmpty()) {
            int st1peak = st1.pop();

            while (!st2.isEmpty() && st2.peek() > st1peak) {
                st1.push(st1.pop());
            }
            st2.push(st1peak);
        }

        System.out.println("Sorted stack :" + st1);
        System.out.println(st2);
    }
}
