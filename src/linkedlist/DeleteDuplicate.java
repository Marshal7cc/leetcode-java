package linkedlist;

/**
 * @author Marshal
 * @date 2021/3/26
 */
public class DeleteDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        // head不会被删除，所以不需要dummyHead
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public class ListNode {
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
