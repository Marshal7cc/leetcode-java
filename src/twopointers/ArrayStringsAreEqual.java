package twopointers;

/**
 * @author Marshal
 * @since 2022/11/1
 */
public class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length, m = word2.length;
        int i = 0, j = 0, p = 0, q = 0;
        while (i < n && j < m) {
            if (word1[i].charAt(p++) != word2[j].charAt(q++)) {
                return false;
            }
            if (p == word1[i].length()) {
                i++;
                p = 0;
            }
            if (q == word2[j].length()) {
                j++;
                q = 0;
            }
        }
        return i == n && j == m;
    }
}
