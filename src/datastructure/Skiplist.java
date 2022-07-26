package datastructure;

import java.util.Arrays;
import java.util.Random;

/**
 * 跳表：
 * 1 head节点为哑节点
 * 2 每一层级的元素都是有序的
 * <p>
 * 为什么比链表快？
 * 因为从高层往0层搜索的时候，中间会跳过很多元素
 *
 * @author Marshal
 * @since 2022/7/26
 */
public class Skiplist {
    /**
     * 跳表的层数
     */
    static final int MAX_LEVEL = 32;
    /**
     * 决定层数的负载因子
     */
    static final double P_FACTOR = 0.25;
    /**
     * 头节点
     * 跳表所有操作的入口，一般是一个哑节点
     * 头节点的forward数组记录了每层的最小值
     */
    private SkiplistNode head;
    /**
     * 当前跳表层级
     */
    private int level;
    private Random random;

    public Skiplist() {
        this.head = new SkiplistNode(-1, MAX_LEVEL);
        this.level = 0;
        this.random = new Random();
    }

    public boolean search(int target) {
        // 从头节点开始搜索
        SkiplistNode curr = this.head;
        // 遍历每一层,每一层都找比target小但是下一个节点比target大(或等于)的节点
        for (int i = level - 1; i >= 0; i--) {
            /* 找到第 i 层小于且最接近 target 的元素*/
            while (curr.forward[i] != null && curr.forward[i].val < target) {
                curr = curr.forward[i];
            }
        }
        // 直到第0层
        // 第0层的curr < target,且curr的下一个节点不小于target，那么这个节点要么是target要么就是元素不存在
        curr = curr.forward[0];
        /* 检测当前元素的值是否等于 target */
        if (curr != null && curr.val == target) {
            return true;
        }
        return false;
    }

    public void add(int num) {
        // 记录跳表中需要更改后继结点的节点
        SkiplistNode[] update = new SkiplistNode[MAX_LEVEL];
        Arrays.fill(update, head);
        SkiplistNode curr = this.head;
        for (int i = level - 1; i >= 0; i--) {
            /* 找到第 i 层小于且最接近 num 的元素*/
            while (curr.forward[i] != null && curr.forward[i].val < num) {
                curr = curr.forward[i];
            }
            update[i] = curr;
        }
        // 随机分配层数
        int lv = randomLevel();
        level = Math.max(level, lv);
        SkiplistNode newNode = new SkiplistNode(num, lv);
        // 1到lv层记录下的元素都需要更新后继节点
        for (int i = 0; i < lv; i++) {
            /* 对第 i 层的状态进行更新，将当前元素的 forward 指向新的节点 */
            newNode.forward[i] = update[i].forward[i];
            update[i].forward[i] = newNode;
        }
    }

    public boolean erase(int num) {
        SkiplistNode[] update = new SkiplistNode[MAX_LEVEL];
        SkiplistNode curr = this.head;
        for (int i = level - 1; i >= 0; i--) {
            /* 找到第 i 层小于且最接近 num 的元素*/
            while (curr.forward[i] != null && curr.forward[i].val < num) {
                curr = curr.forward[i];
            }
            update[i] = curr;
        }
        curr = curr.forward[0];
        /* 如果值不存在则返回 false */
        if (curr == null || curr.val != num) {
            return false;
        }
        // 把包含删除节点的层，前驱节点重新链接后继节点
        for (int i = 0; i < level; i++) {
            if (update[i].forward[i] != curr) {
                break;
            }
            /* 对第 i 层的状态进行更新，将 forward 指向被删除节点的下一跳 */
            update[i].forward[i] = curr.forward[i];
        }
        /* 更新当前的 level */
        while (level > 1 && head.forward[level - 1] == null) {
            level--;
        }
        return true;
    }

    private int randomLevel() {
        int lv = 1;
        /* 随机生成 lv */
        while (random.nextDouble() < P_FACTOR && lv < MAX_LEVEL) {
            lv++;
        }
        return lv;
    }

    /**
     * 跳表节点
     */
    class SkiplistNode {
        /**
         * 当前节点的值
         */
        int val;
        /**
         * forward数组：forward[i]记录了当前节点在第i+1层(0为第1层)的后继节点(在第i+1层比当前节点大的第一个元素)
         * 如果节点的level是3,那么forward数组有3个元素
         */
        SkiplistNode[] forward;

        public SkiplistNode(int val, int maxLevel) {
            this.val = val;
            this.forward = new SkiplistNode[maxLevel];
        }

    }
}

