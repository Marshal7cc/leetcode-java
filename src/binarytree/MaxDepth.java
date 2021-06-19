package binarytree;

import java.util.List;

/**
 * @author Marshal
 * @date 2021/6/19
 */
public class MaxDepth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.isEmpty()) {
            return 1;
        }
        int result = 1;
        for (Node node : root.children) {
            result = Math.max(result, 1 + maxDepth(node));
        }
        return result;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
