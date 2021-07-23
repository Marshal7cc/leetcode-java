package differencearray;

/**
 * @author Marshal
 * @date 2021/7/23
 */
public class IsCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] arr = new int[52];
        for (int[] range : ranges) {
            arr[range[0]]++;
            arr[range[1] + 1]--;
        }

        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += arr[i];
            if (i >= left && i <= right && sum <= 0) {
                return false;
            }
        }
        return true;
    }
}
