package cronis.lections.stack.Task3;

import java.util.Arrays;

class Stack {
    private int STACK_SIZE = 2;
    private int STACKS_COUNT = 3;
    private int[] STACKS = new int[STACK_SIZE * STACKS_COUNT];
    private int[] STACK_SIZES = new int[STACKS_COUNT];

    private boolean isOutOfRange(int stackIndex) {
        return stackIndex < 0 || stackIndex > STACKS_COUNT - 1;
    }

    public boolean isEmptyDefStack(int stackIndex) {
        return STACK_SIZES[stackIndex] == 0;
    }

    public int getStackTop(int stackIndex) {
        int stackStart = stackIndex * STACK_SIZE;
        return stackStart + STACK_SIZES[stackIndex] - 1;
    }

    public void push(int stackIndex, int value) throws Exception {
        if (isOutOfRange(stackIndex)) throw new Exception("Stack index out of range");
        int stackTop = getStackTop(stackIndex);
        if (STACK_SIZES[stackIndex] == STACK_SIZE) throw new Exception("Stack overflow");
        STACKS[stackTop + 1] = value;
        STACK_SIZES[stackIndex] += 1;
    }

    public int pop(int stackIndex) throws Exception {
        if (isOutOfRange(stackIndex)) throw new Exception("Stack index out of range");
        if (isEmptyDefStack(stackIndex)) throw new Exception("Stack " + stackIndex + " is empty");
        int stackTop = getStackTop(stackIndex);
        STACK_SIZES[stackIndex] -= 1;
        return STACKS[stackTop];

    }

    public int peek(int stackIndex) throws Exception {
        if (isOutOfRange(stackIndex)) throw new Exception("Stack index out of range");
        if (isEmptyDefStack(stackIndex)) throw new Exception("Stack " + stackIndex + " is empty");
        int stackTop = getStackTop(stackIndex);
        return STACKS[stackTop];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "STACK_SIZE=" + STACK_SIZE +
                ", STACKS_COUNT=" + STACKS_COUNT +
                ", STACKS=" + Arrays.toString(STACKS) +
                ", STACK_SIZES=" + Arrays.toString(STACK_SIZES) +
                '}';
    }
}

class Solution {
    public static void main(String... args) throws Exception {
        Stack st = new Stack();
        st.push(0, 2);
        st.push(0, 3);
        st.push(1, 2);
        st.push(2, 2);
        System.out.println(st);
    }
}
