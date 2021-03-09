package linkedlist;

/**
 * @author Marshal
 * @date 2021/3/9
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 返回结果de 首节点&尾节点
        ListNode head = null, tail = null;
        // 进位
        int carry = 0;
        // 遍历直到长链表最后一位
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;

            ListNode cur = new ListNode(sum);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                tail = cur;
            }
            // 这里必须放在else里,不然1+1计算会有问题
            // tail.next = cur;
            // tail = cur;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1) {
            tail.next = new ListNode(1);
        }

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
