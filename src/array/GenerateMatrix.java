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
}
