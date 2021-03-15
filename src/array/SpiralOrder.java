package array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/15
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        boolean[][] visited = new boolean[m][n];

        // 保存方向向量
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // 保存当前所在位置
        int row = 0;
        int col = 0;
        int currentDirectionIdx = 0;
        for (int i = 0; i < total; i++) {
            ans.add(matrix[row][col]);
            visited[row][col] = true;
            // 计算下一个节点
            int nextRow = row + directions[currentDirectionIdx][0];
            int nextCol = col + directions[currentDirectionIdx][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                currentDirectionIdx = (currentDirectionIdx + 1) % 4;
            }
            row = row + directions[currentDirectionIdx][0];
            col = col + directions[currentDirectionIdx][1];
        }
        return ans;
    }
}
