package unclassified;

/**
 * @author Marshal
 * @date 2021/8/17
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        int n = s.length();

        int absence = 0;
        int late = 0;
        for (int i = 0; i < n; i++) {
            if ('A' == s.charAt(i)) {
                absence++;
                if (absence >= 2) {
                    return false;
                }
            }

            if ('L' == s.charAt(i)) {
                late++;
                if (late >= 3) {
                    return false;
                }
            } else {
                late = 0;
            }
        }
        return true;
    }
}
