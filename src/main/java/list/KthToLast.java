package list;

import java.util.Stack;

public class KthToLast {
    public int kthToLast(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            if (k==1) {
                return node.val;
            } else {
                k--;
            }
        }
        return 0;
    }
}
