package cronis.lections.linked_list_doubly;

public class FindNFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        head.add(6);

        int idx = new FindNFromEnd().findNFromEnd(head, 2);
        System.out.println(idx);
    }

    public int findNFromEnd(ListNode head, int k) {
        int idx = 0;
        int len = 0;
        boolean finded = false;
        while (head != null) {
            if (head.data == k) {
                finded = true;
            }
            if (!finded) idx++;

            head = head.next;
            len++;
        }
        return len - idx + 1;
    }
}
