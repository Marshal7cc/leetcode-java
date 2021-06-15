package binarysearch;

/**
 * @author Marshal
 * @date 2021/6/15
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n - 2;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
