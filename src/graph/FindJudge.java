package graph;

/**
 * @author Marshal
 * @since 2021/12/19
 */
public class FindJudge {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n];
        int[] out = new int[n];

        for (int[] fact : trust) {
            out[fact[0] - 1]++;
            in[fact[1] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (out[i] == 0 && in[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
