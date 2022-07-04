package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/7/4
 */
public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                ans.clear();
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            } else if (diff == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
