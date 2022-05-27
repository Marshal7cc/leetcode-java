package array;

/**
 * @author Marshal
 * @since 2022/5/27
 */
public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int idx1 = -1;
        int idx2 = -1;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                idx1 = i;
                if (idx2 != -1) {
                    ans = Math.min(ans, Math.abs(idx1 - idx2));
                }
            }

            if (words[i].equals(word2)) {
                idx2 = i;
                if (idx1 != -1) {
                    ans = Math.min(ans, Math.abs(idx1 - idx2));
                }
            }
        }
        return ans;
    }
}
