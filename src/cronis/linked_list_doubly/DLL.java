package cronis.linked_list_doubly;

public class DLL {
    public DLL next;
    public DLL prev;
    public int data;

    DLL head = null;
    DLL tail = null;

    public void addAfterTail(int data) {
        DLL newTail = new DLL(); // Создание и заполнение данными нового узла списка
        newTail.data = data;
        if (head == null) { // Если список пуст, новый узел становится первым и последним элементом
            head = newTail;
            tail = newTail;
        } else { // Связывание нового узла с существующим списком. Конец списка ссылается на новый узел
            tail.next = newTail;
            newTail.prev = tail;
            tail = newTail;
        }
    }

    public void addBeforeHead(int data) {
        DLL newHead = new DLL(); // Создание и заполнение данными нового узла списка
        newHead.data = data;
        if (head == null) { // Если список пуст. новый узел становится первым и последним элементом
            head = newHead;
            tail = newHead;
        } else { // Связыване нового узла с существуюшим списком. Новый узел становится началом списка
            newHead.head = head;
            newHead.prev = newHead;
            head = newHead;
        }
    }

    public DLL searchBeforeHead(int data) {
        if (head == null) return null;
        while (head != null) {
            if (head.data == data) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public void insert(DLL prev, DLL newNode) {
        newNode.next.prev = newNode;
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
    }
}
