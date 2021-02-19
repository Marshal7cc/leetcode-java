package differencearray;

/**
 * @author Marshal
 * @date 2021/2/18
 */
public class MinKBitFlips {
    public int minKBitFlips(int[] A, int K) {
        int len = A.length;
        // 每个节点的翻转次数的差分数组
        int[] diff = new int[len + 1];

        // 循环使用，用来记录每个节点的翻转次数==》sumRev[n]代表索引为n的元素翻转的次数
        // 而sumRev[n] = diff[0]+..+diff[n]
        int sumRev = 0;
        // 整个数组翻转次数，即结果
        int revCount = 0;

        for (int i = 0; i < len; i++) {
            sumRev += diff[i];
            if ((sumRev + A[i]) % 2 == 0) {
                if (i + K > len) {
                    return -1;
                }

                diff[i]++;
                diff[i + K]--;
                sumRev += 1;
                revCount++;
            }
        }
        return revCount;
    }
}
