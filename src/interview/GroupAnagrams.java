package interview;

import java.util.*;

/**
 * @author Marshal
 * @date 2021/7/18
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>(strs.length);

        for (String str : strs) {
            char[] arr = str.toCharArray();
            // 对字符串排序，如果符合条件排序后一定相等
            Arrays.sort(arr);

            String key = new String(arr);
            List<String> list = map.getOrDefault(key, new LinkedList<>());
            list.add(str);

            map.put(key, list);
        }
        return new LinkedList<>(map.values());
    }
}
