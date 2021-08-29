package array;

/**
 * @author Marshal
 * @since 2021/8/29
 */
public class SumOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int LeftOdd = (i + 1) / 2, LeftEven = i / 2 + 1;
            int RightOdd = (n - i) / 2, RightEven = (n - 1 - i) / 2 + 1;
            ans += arr[i] * (LeftEven * RightEven + LeftOdd * RightOdd);
        }
        return ans;
    }
}
