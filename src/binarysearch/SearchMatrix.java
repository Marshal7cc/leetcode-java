package binarysearch;

/**
 * @author Marshal
 * @date 2021/3/30
 */
public class SearchMatrix {
    public void main(String[] args) {
        int[][] m = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(m, 13));
        ;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = rowSearch(matrix, target);
        if (row == 0 && matrix[0][matrix[0].length - 1] < target) {
            return false;
        }
        int col = colSearch(matrix[row], target);

        return matrix[row][col] == target;
    }

    private int rowSearch(int[][] matrix, int target) {
        int m = matrix.length;
        int start = 0;
        int end = m - 1;

        while (start < end) {
            // tips: end-start+1 / 2
            // 避免造成死循环
            int mid = (end - start + 1) / 2 + start;
            if (matrix[mid][0] <= target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    private int colSearch(int[] row, int target) {
        int n = row.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = (end - start + 1) / 2 + start;
            if (row[mid] <= target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
