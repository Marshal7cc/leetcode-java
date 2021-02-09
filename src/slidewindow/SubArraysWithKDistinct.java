package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/9
 */
public class SubArraysWithKDistinct {

    public int subarraysWithKDistinct(int[] A, int K) {
        //恰好为K可以转变为->(最多为k个)-(最多为k-1个)
        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }

    public int atMostKDistinct(int[] A, int K) {
        int len = A.length;
        int[] freq = new int[len + 1];

        int left = 0;
        int right = 0;
        // [left,right)中不同整数的个数
        int count = 0;
        int res = 0;

        while (right < len) {
            if (freq[A[right]] == 0) {
                count++;
            }
            freq[A[right]]++;
            // 这里right++了，下面用right-1
            right++;

            // 以下均针对[left,right-1]
            while (count > K) {
                freq[A[left]]--;
                if (freq[A[left]] == 0) {
                    count--;
                }
                left++;
            }
            // (right-1)-left+1,区间[left,right-1]的长度即 左边界固定为left时,满足连续子数组满足最大数字个数为K的子数组的个数
            res += right - left;
        }
        return res;
    }
}
