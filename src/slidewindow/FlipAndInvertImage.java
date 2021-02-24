package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/24
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            int len = row.length;
            int left = 0;
            int right = len - 1;

            while (left < right) {
                if (row[left] == row[right]) {
                    row[left] ^= 1;
                    row[right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right) {
                row[left] ^= 1;
            }
        }
        return A;
    }
}
