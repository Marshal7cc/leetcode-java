package slidewindow;

/**
 * @author Marshal
 * @since 2023/5/11
 */
public class QueryString {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            if (!s.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }
        return true;
    }
}
