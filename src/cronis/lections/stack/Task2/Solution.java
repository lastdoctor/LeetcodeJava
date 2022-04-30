package cronis.lections.stack.Task2;


import java.util.*;

class Stack1 {
    private final Stack<Stack<Integer>> stackList = new Stack<>();
    private final int SINGLE_STACK_SIZE = 3;

    private Stack<Integer> getLastStack() {
        return stackList.peek();
    }

    private boolean lastStackIsFull() {
        if (stackList.isEmpty()) return false;
        return getLastStack().size() == SINGLE_STACK_SIZE;
    }

    private void deleteLastStack() {
        stackList.pop();
    }

    public void push(int value) {
        if (stackList.isEmpty() || lastStackIsFull()) stackList.push(new Stack<>());
        getLastStack().push(value);
    }

    public int pop() throws Exception {
        if (stackList.isEmpty()) throw new Exception("Stack is empty");
        Stack<Integer> lastStack = getLastStack();
        if (lastStack.isEmpty()) {
            deleteLastStack();
            return getLastStack().pop();
        }
        return lastStack.pop();
    }

    @Override
    public String toString() {
        return "Stack1{" +
                "stackList=" + stackList +
                ", SINGLE_STACK_SIZE=" + SINGLE_STACK_SIZE +
                '}';
    }
}

class Solution {
    public static void main(String... args) {
        Stack1 st = new Stack1();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
    }
}

