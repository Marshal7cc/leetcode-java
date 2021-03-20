package offer;

/**
 * @author Marshal
 * @date 2021/3/20
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        int num = (int) Math.pow(10, n) - 1;
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
