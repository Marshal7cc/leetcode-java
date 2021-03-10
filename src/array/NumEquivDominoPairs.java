package array;

/**
 * @author Marshal
 * @date 2021/3/10
 */
public class NumEquivDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int[] temp = new int[100];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int idx = dominoes[i][0] > dominoes[i][1] ? 10 * dominoes[i][0] + dominoes[i][1] : 10 * dominoes[i][1] + dominoes[i][0];
            // 题目不太友好
            // 求的是对于任意i,匹配的j的数量之和
            // 把数组倒置考虑比较好考虑
            ans += temp[idx];
            temp[idx]++;
        }
        return ans;
    }
}
