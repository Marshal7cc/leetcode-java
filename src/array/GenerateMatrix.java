package array;

/**
 * @author Marshal
 * @date 2021/3/16
 */
public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int total = n * n;

        int row = 0;
        int col = 0;
        int value = 1;
        int currentDirectionIdx = 0;
        while (value <= total) {
            ans[row][col] = value;
            visited[row][col] = true;

            int nextRow = row + directions[currentDirectionIdx][0];
            int nextCol = col + directions[currentDirectionIdx][1];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                currentDirectionIdx = (currentDirectionIdx + 1) % 4;
            }
            row += directions[currentDirectionIdx][0];
            col += directions[currentDirectionIdx][1];

            value++;
        }
        return ans;
    }

    public int[][] generateMatrixImprove(int n) {
        // 优化:不需要额外的矩阵存储是否被赋过值
        // 如果赋值过，则元素不为0
        int[][] ans = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int total = n * n;

        int row = 0;
        int col = 0;
        int value = 1;
        int currentDirectionIdx = 0;
        while (value <= total) {
            ans[row][col] = value;

            int nextRow = row + directions[currentDirectionIdx][0];
            int nextCol = col + directions[currentDirectionIdx][1];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || ans[nextRow][nextCol] != 0) {
                currentDirectionIdx = (currentDirectionIdx + 1) % 4;
            }
            row += directions[currentDirectionIdx][0];
            col += directions[currentDirectionIdx][1];

            value++;
        }
        return ans;
    }
}
