package cronis.queue;

class Node {
    int value;
    Node prev;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", prev=" + prev +
                '}';
    }
}

public class Queue {
    private Node HEAD = null;
    private Node TAIL = null;
    int queueSize = 0;

    void enqueue(int value) {
        Node newNode = new Node(value);
        if (TAIL != null)
            TAIL.prev = newNode;

        TAIL = newNode;

        if (HEAD == null)
            HEAD = TAIL;

        queueSize++;
    }

    int dequeue() throws Exception {
        if (HEAD == null)
            throw new Exception("Queue is empty");
        int value = HEAD.value;
        HEAD = HEAD.prev;
        if (HEAD == null) TAIL = null;
        queueSize--;
        return value;
    }

    int peek() throws Exception{
        if (HEAD == null)
            throw new Exception("Queue is empty");
        return HEAD.value;
    }

    boolean isEmpty() {
        return HEAD == null;
    }

    int getSize() {
        return queueSize;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "HEAD=" + HEAD +
                ", TAIL=" + TAIL +
                ", queueSize=" + queueSize +
                '}';
    }
}

class Solution {
    public static void main(String ...args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q);

    }
}