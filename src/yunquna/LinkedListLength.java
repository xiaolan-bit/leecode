package yunquna;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListLength {
    public int lengthL(ListNode head) {
        if (head == null) {
            return 0;
        }

        HashSet<Integer> seenValues = new HashSet<>();
        int length = 0;

        ListNode current = head;
        while (current != null) {
            if (!seenValues.contains(current.val)) {
                seenValues.add(current.val);
                length++;
            }
            current = current.next;
        }

        return length;
    }

    public static void main(String[] args) {
        // 示例用法
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        LinkedListLength solution = new LinkedListLength();
        int length = solution.lengthL(head);
        System.out.println("链表的长度是：" + length); // 输出3
    }
}
