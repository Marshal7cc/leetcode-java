package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/7/25
 */
public class RestoreArray {
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] arr : adjacentPairs) {
            map.putIfAbsent(arr[0], new ArrayList<>());
            map.putIfAbsent(arr[1], new ArrayList<>());

            map.get(arr[0]).add(arr[1]);
            map.get(arr[1]).add(arr[0]);
        }

        int[] ans = new int[n + 1];
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                ans[0] = entry.getKey();
                break;
            }
        }

        ans[1] = map.get(ans[0]).get(0);
        for (int i = 2; i <= n; i++) {
            Integer val = map.get(ans[i - 1]).get(0);
            ans[i] = val == ans[i - 2] ? map.get(ans[i - 1]).get(1) : val;
        }
        return ans;
    }
}
