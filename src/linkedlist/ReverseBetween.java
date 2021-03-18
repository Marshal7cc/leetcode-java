package linkedlist;

/**
 * @author Marshal
 * @date 2021/3/18
 */
public class ReverseBetween {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(5));
        reverseBetween(head, 1, 2);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 虚拟头节点，避免空指针异常
        ListNode vHead = new ListNode(-1);
        vHead.next = head;

        // 第left-1个节点
        ListNode beforeLeft = null;
        // 第right+1个节点
        ListNode afterRight = null;
        // 第left个节点
        ListNode betHead = null;
        int index = 0;
        ListNode curr = vHead;
        while (index < left - 1) {
            curr = curr.next;
            index++;
        }
        beforeLeft = curr;
        betHead = curr.next;
        while (index < right) {
            curr = curr.next;
            index++;
        }
        afterRight = curr.next;

        ListNode pre = afterRight;
        ListNode cur = betHead;
        while (cur != afterRight) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        beforeLeft.next = pre;
        return vHead.next;
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
