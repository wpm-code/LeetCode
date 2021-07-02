package list;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 反转链表
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        Stack<ListNode> stack = new Stack<>();
        while (head!=null) {
            stack.push(head);
            head=head.next;
        }
        if (stack.isEmpty()) {
            return null;
        }
        ListNode node = stack.pop();
        first = node;
        while (stack.size()!=0) {
            node.next=stack.pop();
            node = node.next;
        }
        node.next=null;     //最后一个节点置空，否则会构成环
        return first;
    }
}
