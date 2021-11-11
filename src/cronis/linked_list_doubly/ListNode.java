package cronis.linked_list_doubly;

public class ListNode {
    public int data;
    public ListNode next;
    ListNode head = null;
    ListNode tail = null;

    public void add(int data) {
        ListNode newHead = new ListNode(); // Создание нового узла списка
        newHead.data = data; // Заполнение нового узла данными
        newHead.next = head; // Связывание нового узла с существующим списком:
        // новый узел ссылается на узел, который ранее был первым
        if (head == null) { // Если список был пуст, новый узел является одновременно началом и концом
            // то есть хвостом списка
            tail = newHead;
        }
        head = newHead; // Обновление указателя на начало списка. Теперь список начинается с только
        // что добавленного элемента
    }

    public void addAfterTail() {
        ListNode newTail = new ListNode();
        newTail.data = data;
        if (head == null) {
            head = newTail;
            tail = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
    }

    public ListNode search(int data) {
        if (head == null) return null;
        while (head != null) {
            if (head.data == data) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public void insert(ListNode prev, ListNode newNode) {
        newNode.next = prev.next;
        prev.next = newNode;
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
