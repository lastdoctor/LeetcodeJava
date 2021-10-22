package cronis.stack.Task1;

class Stack {
    private int STACK_TOP = -1;
    private int STACK_SIZE = 3;
    int[] STACK = new int[STACK_SIZE];
    int stackSize = 0;

    void push(int value) throws Exception {
        if (STACK_TOP == STACK_SIZE - 1)
            throw new Exception("Stack overflow");
        this.STACK_TOP += 1;
        STACK[this.STACK_TOP] = value;
        this.stackSize++;
    }
}

class Solution {
}
