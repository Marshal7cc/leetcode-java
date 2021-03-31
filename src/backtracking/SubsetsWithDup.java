package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/31
 */
public class SubsetsWithDup {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tempRes = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, nums, 0);
        return ans;
    }

    private void dfs(boolean choosePre, int[] nums, int idx) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(tempRes));
            return;
        }
        boolean insert = false;
        dfs(false, nums, idx + 1);
        if (!choosePre && idx > 0 && nums[idx - 1] == nums[idx]) {
            return;
        }
        tempRes.add(nums[idx]);
        dfs(true, nums, idx + 1);
        tempRes.remove(tempRes.size() - 1);
    }
}
