package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/8
 */
public class MaxTurbulenceSize {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = 0;
        int maxSize = 1;
        while (right < len - 1) {
            // left == right的情况
            if (left == right) {
                right++;
                if (arr[left] == arr[left + 1]) {
                    left++;
                }
            } else {
                if ((arr[right - 1] < arr[right] && arr[right] > arr[right + 1])
                        || arr[right - 1] > arr[right] && arr[right] < arr[right + 1]) {
                    // 这一步不能在这里做，因为整个数组中可能没有符合这个条件的情况
                    //maxSize = Math.max(maxSize, right - left + 2);
                    right++;
                } else {
                    left = right;
                }
            }
            // [left,right+1]的长度，但right++,所以是right-left+1
            maxSize = Math.max(maxSize, right - left + 1);
        }
        return maxSize;
    }
}
