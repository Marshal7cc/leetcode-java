package binarysearch;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/8/1
 */
public class KWeakestRows {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        kWeakestRows(mat, 3);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        List<Integer[]> list = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            list.add(new Integer[]{i, bs(mat[i])});
        }

        Collections.sort(list, (m, n) -> {
            if (m[1].compareTo(n[1]) == 0) {
                return m[0].compareTo(n[0]);
            } else {
                return m[1].compareTo(n[1]);
            }
        });

        int[] ans = new int[k];
        Iterator<Integer[]> iterator = list.iterator();
        for (int i = 0; i < k; i++) {
            ans[i] = iterator.next()[0];
        }

        return ans;
    }

    private static int bs(int[] row) {
        int n = row.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
