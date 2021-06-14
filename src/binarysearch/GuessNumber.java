package binarysearch;

/**
 * @author Marshal
 * @date 2021/6/14
 */
public class GuessNumber {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            // 防止计算时溢出
            //int mid = (right + left) / 2;
            int mid = left + (right - left) / 2;
            //  if (guess(mid)>0) {
            if (mid < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
