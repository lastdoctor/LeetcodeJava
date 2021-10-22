package cronis.stack.Task1;

class Stack {
    private int STACK_TOP = -1;
    private int STACK_SIZE;
    int[] STACK = new int[STACK_SIZE];
    int stackSize = 0;

    Stack(int stack_size) {
        this.STACK_SIZE = stack_size;
    }

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
}

class Solution {
//    pb
}
