package linkedlist;

/**
 * @author Marshal
 * @date 2021/6/5
 */
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
