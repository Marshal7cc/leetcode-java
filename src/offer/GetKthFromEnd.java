package offer;

/**
 * @author Marshal
 * @since 2021/9/5
 */
public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dHead = head;

        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        int index = size - k;
        ListNode ans = dHead;
        while (index > 0) {
            ans = ans.next;
            index--;
        }
        return ans;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
