package unclassified;

/**
 * @author Marshal
 * @date 2021/7/30
 */
public class TitleToNumber {
    public static void main(String[] args) {
        System.out.println(Math.pow(26, 2));
    }

    public int titleToNumber(String columnTitle) {
        char[] arr = columnTitle.toCharArray();
        int n = arr.length;

        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += (arr[i] - 'A' + 1) * Math.pow(26, n - 1 - i);
        }
        return ans;
    }
}
