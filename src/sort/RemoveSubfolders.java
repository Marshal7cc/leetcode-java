package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @since 2023/2/8
 */
public class RemoveSubfolders {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();

        Arrays.sort(folder);
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; ++i) {
            int preLength = ans.get(ans.size() - 1).length();
            if (!(preLength < folder[i].length() && ans.get(ans.size() - 1).equals(folder[i].substring(0, preLength)) && folder[i].charAt(preLength) == '/')) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}
