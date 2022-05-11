package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Marshal
 * @since 2022/5/11
 */


public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(ans, root);

        return ans.stream().map(String::valueOf).collect(Collectors.joining(","));
    }

    private void postOrder(List<Integer> ans, TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(ans, node.left);
        postOrder(ans, node.right);
        ans.add(node.val);
    }

    /**
     * 二叉树反序列化
     * 1 节点入队列
     * 2 zz
     *
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        String[] arr = data.split(",");
        // 入栈
        Deque<Integer> stack = new ArrayDeque<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // Deque#push 放到队头
            stack.push(Integer.parseInt(arr[i]));
        }
        return construct(Integer.MIN_VALUE, Integer.MAX_VALUE, stack);

    }

    private TreeNode construct(int lower, int upper, Deque<Integer> stack) {
        if (stack.isEmpty() || stack.peek() < lower || stack.peek() > upper) {
            return null;
        }
        int val = stack.pop();
        TreeNode root = new TreeNode(val);
        root.right = construct(val, upper, stack);
        root.left = construct(lower, val, stack);
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
