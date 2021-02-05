package slidewindow;

/**
 * "krpgjbjjznpzdfy"
 * "nxargkbydxmsgby"
 * 14
 *
 * @author Marshal
 * @date 2021/2/5
 */
public class EqualSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        // 左、右起点
        int left = 0;
        int right = 0;
        int cost = 0;
        int maxLen = 0;
        int[] costArr = new int[len];

        while (right < len && len - left > maxLen) {
            costArr[right] = Math.abs(arrT[right] - arrS[right]);
            cost += costArr[right];

            while (cost > maxCost) {
                // 不能在这里计算maxLen，因为这里cost不符合，计算无效,并不是只有首次超过maxCost会进入这里
                // 实际上当cost<=maxCost的时候就不会进入这里了，所以计算出的maxLen是实际maxLen+1
                //maxLen = Math.max(maxLen, right - left);
                cost -= costArr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
