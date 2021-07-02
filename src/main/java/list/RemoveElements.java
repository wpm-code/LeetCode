package list;

/**
 * 删除链表中数据为val的节点
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);    //定义一个虚拟节点在头节点之前
        node.next = head;
        ListNode pre = node;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return node.next;
    }
}
