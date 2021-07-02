package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        this.stack1 = new LinkedList<Integer>();
        this.stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            Integer num = stack2.pop();
            return num;
        }
    }
}
