## 题目描述

请你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：

实现 MyQueue 类：
<br>void push(int x) 将元素 x 推到队列的末尾
<br>int pop() 从队列的开头移除并返回元素
<br>int peek() 返回队列开头的元素
<br>boolean empty() 如果队列为空，返回 true ；否则，返回 false

说明：
<br>你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
<br>你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。

进阶：
<br>你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，即使其中一个操作可能花费较长时间。

示例：
<br>输入：
<br>["MyQueue", "push", "push", "peek", "pop", "empty"]
<br>[[], [1], [2], [], [], []]
<br>输出：
<br>[null, null, null, 1, 1, false]

解释：
<br>MyQueue myQueue = new MyQueue();
<br>myQueue.push(1); // queue is: [1]
<br>myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
<br>myQueue.peek(); // return 1
<br>myQueue.pop(); // return 1, queue is [2]
<br>myQueue.empty(); // return false

提示：
<br>1 <= x <= 9
<br>最多调用 100 次 push、pop、peek 和 empty
<br>假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/implement-queue-using-stacks/solution/yong-zhan-shi-xian-dui-lie-by-leetcode-s-xnb6/)
<br>[==>WITH-VIDEO<==](https://leetcode-cn.com/problems/implement-queue-using-stacks/solution/232-yong-zhan-shi-xian-dui-lie-liang-ge-zhan-lai-m/)

## 代码

[MyQueue.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/queue/MyQueue.java)

