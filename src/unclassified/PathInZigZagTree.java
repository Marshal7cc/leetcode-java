package unclassified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/7/29
 */
public class PathInZigZagTree {
    public List<Integer> pathInZigZagTree(int label) {
        // 计算行数
        int row = 1, rowStart = 1;
        while (rowStart * 2 <= label) {
            row++;
            rowStart *= 2;
        }
        // 先模拟成不逆序的
        if (row % 2 == 0) {
            label = getReverse(label, row);
        }
        List<Integer> path = new ArrayList<>();
        while (row > 0) {
            if (row % 2 == 0) {
                path.add(getReverse(label, row));
            } else {
                path.add(label);
            }
            row--;
            label >>= 1;
        }
        Collections.reverse(path);
        return path;
    }

    public int getReverse(int label, int row) {
        // 2的i-1次方 + 2的i次方-1 -label
        return (1 << row - 1) + (1 << row) - 1 - label;
    }
}
