package linkedlist;

/**
 * @author Marshal
 * @since 2021/9/22
 */
public class SplitListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int avg = n / k;
        int rem = n % k;


        ListNode[] res = new ListNode[k];

        ListNode cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            int count = avg + (i < rem ? 1 : 0);
            res[i] = cur;

            for (int m = 1; m < count; m++) {
                cur = cur.next;
            }

            ListNode next = cur.next;
            cur.next = null;
            cur = next;

        }

        return res;
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
