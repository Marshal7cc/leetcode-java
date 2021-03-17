package dp;

/**
 * @author Marshal
 * @date 2021/3/17
 */
public class NumDistinct {
    public static void main(String[] args) {
        numDistinct("rabbbit"
                , "rabbit");
    }

    public static int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        // dp[i][j]记录s前i个字符s[0,i-1],t前j个字符t[0,j-1]的对应符合题意的数量
        int[][] dp = new int[m + 1][n + 1];
        // i=0,s为空字符串，dp[0][x]一定为0,但默认值为0,所以无需额外设置
//        for (int i = 0; i < n; i++) {
//            dp[0][i] = 0;
//        }
        // j=0,t为空字符串，dp[x][0]一定为1
        for (int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}
