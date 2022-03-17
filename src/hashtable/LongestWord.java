package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Marshal
 * @since 2022/3/17
 */
public class LongestWord {
    public String longestWord(String[] words) {
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return b.compareTo(a);
            }
        });
        String longest = "";
        Set<String> set = new HashSet<String>();
        set.add("");
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                longest = word;
            }
        }
        return longest;
    }

}
