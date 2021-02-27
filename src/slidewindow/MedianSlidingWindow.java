package slidewindow;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * [-2147483648,-2147483648,2147483647,-2147483648,1,3,-2147483648,-100,8,17,22,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648]
 * 6
 *
 * @author Marshal
 * @date 2021/2/27
 */
public class MedianSlidingWindow {
    public static void main(String[] args) {
        double[] doubles = medianSlidingWindow(new int[]{-2147483648, -2147483648, 2147483647, -2147483648, 1, 3, -2147483648, -100, 8, 17, 22, -2147483648, -2147483648, 2147483647, 2147483647, 2147483647, 2147483647, -2147483648, 2147483647, -2147483648}, 6);
        for (double d : doubles) {
            System.out.println(d);
        }
    }

    public static double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        TreeSet<int[]> set = new TreeSet<>((o1, o2) -> o1[0] == o2[0] ? Integer.compare(o1[1], o2[1]) : Integer.compare(o1[0], o2[0]));
        for (int i = 0; i < k; i++) {
            set.add(new int[]{nums[i], i});
        }

        double[] res = new double[len - k + 1];
        for (int i = 0; i <= len - k - 1; i++) {
            res[i] = findMid(set);
            set.remove(new int[]{nums[i], i});
            set.add(new int[]{nums[i + k], i + k});
        }
        res[len - k] = findMid(set);
        return res;
    }

    private static double findMid(TreeSet<int[]> set) {
        int size = set.size();
        int k = (size - 1) / 2;
        Iterator<int[]> it = set.iterator();
        // 循环k-1次,调用了k-1次it.next,此时获取到第k个数
        // 下面再调用it.next()是获取第k+1个数
        while (k-- > 0) {
            it.next();
        }
        // 避免数据过大,下一行数据过大时不通过
        //return size % 2 == 1 ? it.next()[0] : ((double) (it.next()[0] + it.next()[0])) / 2;
        return size % 2 == 1 ? it.next()[0] : (((double) it.next()[0] + (double) it.next()[0])) / 2;
    }
}
