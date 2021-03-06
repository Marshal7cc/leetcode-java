package stack;

import java.util.Stack;

/**
 * @author Marshal
 * @date 2021/3/5
 */
public class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        }
        transfer();
        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!outStack.isEmpty()) {
            return outStack.peek();
        }
        transfer();
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void transfer() {
        while (!inStack.isEmpty()) {
            Integer x = inStack.pop();
            outStack.push(x);
        }
    }
}
