package linkedlist;

/**
 * @author Marshal
 * @date 2021/3/27
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        // 统计链表长度
        int n = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            n++;
        }

        int x = n - k % n;
        if (x == n) {
            return head;
        }
        // 在这里变成环装链表,放在后面避免不处理的情况，避免返回结果为环状链表
        cur.next = head;

        cur = head;

        while (x > 1) {
            cur = cur.next;
            x--;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;

        //变环后无需再次遍历
//        cur = newHead;
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        cur.next = head;
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
