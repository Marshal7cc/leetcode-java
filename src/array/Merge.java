package array;

/**
 * @author Marshal
 * @date 2021/4/5
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        int idx1 = m - 1;
        int idx2 = n - 1;
        while (idx >= 0) {
            if (idx1 == -1) {
                nums1[idx] = nums2[idx2--];
            } else if (idx2 == -1) {
                nums1[idx] = nums1[idx1--];
            } else if (nums1[idx1] > nums2[idx2]) {
                nums1[idx] = nums1[idx1--];
            } else {
                nums1[idx] = nums2[idx2--];
            }
            idx--;
        }
    }
}
