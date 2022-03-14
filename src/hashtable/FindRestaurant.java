package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marshal
 * @since 2022/3/14
 */
public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                if (minVal > map.get(s) + i) {
                    ans.clear();
                    minVal = map.get(s) + i;
                    ans.add(s);
                } else if (minVal == map.get(s) + i) {
                    ans.add(s);
                }
            }
        }
        return ans.toArray(new String[]{});
    }
}
