package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/31
 */
public class Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tempRes = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int idx) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(tempRes));
            return;
        }
        tempRes.add(nums[idx]);
        dfs(nums, idx + 1);
        tempRes.remove(tempRes.size() - 1);
        dfs(nums, idx + 1);
    }
}
