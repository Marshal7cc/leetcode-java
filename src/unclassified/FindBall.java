package unclassified;

/**
 * @author Marshal
 * @since 2022/2/24
 */
public class FindBall {
    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int col = i;
            for (int[] row : grid) {
                int dire = row[col];
                col = col + dire;
                if (col < 0 || col == n || dire != row[col]) {
                    ans[i] = -1;
                    break;
                }
            }
            if (ans[i] != -1) {
                ans[i] = col;
            }
        }
        return ans;
    }
}
