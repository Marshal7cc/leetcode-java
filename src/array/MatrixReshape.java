package array;

/**
 * @author Marshal
 * @date 2021/2/17
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] res = new int[r][c];
        // ** 二维数组一维化
        //1 根据下标计算在一维数组中的下标
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                int idx = i * n + j;
//                res[idx / c][idx % c] = nums[i][j];
//            }
//        }

        //2 用idx++来计算
//        int idx = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                res[idx / c][idx % c] = nums[i][j];
//                idx++;
//            }
//        }

        //3 反推
        for (int i = 0; i < m * n; i++) {
            res[i / c][i % c] = nums[i / n][i % n];
        }
        return res;
    }
}
