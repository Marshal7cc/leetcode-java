package unclassified;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2021/9/16
 */
public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        int s = words.length;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i != j && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
