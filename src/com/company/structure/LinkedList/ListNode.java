package com.company.structure.LinkedList;

//public class ListNode<T> {
//    private final T value;
//}

class LinkedList<T> {
    private Node<T> head;

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(T t) {
        if (head == null) {
            head = new Node<>(t);
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int get(T t) {
        if (head == null) {
            return -1;
        }
        if (head.value == t) {
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == t) {
                return result;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    public void remove(T t) {
        if (head.value == t) {
            head = head.next;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");
        list.addFirst("G");
        System.out.println("LL : " + list);
        list.addFirst("A");
        System.out.println("LL : " + list);
        System.out.println("Index of element wth value D : " + list.get("D"));
        System.out.println("Index of element wth value Z : " + list.get("Z"));
    }
}