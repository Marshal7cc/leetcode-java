package dfs;


public class BtreeGameWinningMove {
    private TreeNode target;

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        find(root, x);

        int l = getSubSize(target.left);
        int m = getSubSize(target.right);
        int k = n - l - m - 1;


        return l >= (n + 1) / 2 || m >= (n + 1) / 2 || k >= (n + 1) / 2;
    }

    private void find(TreeNode root, int x) {
        if (target != null || root == null) {
            return;
        }
        if (root.val == x) {
            target = root;
            return;
        }

        find(root.left, x);
        find(root.right, x);
    }

    private int getSubSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSubSize(node.left) + getSubSize(node.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

