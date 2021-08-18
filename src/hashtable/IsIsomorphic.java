package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/8/18
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> map = new HashMap<>(n);
        Map<Character, Character> rMap = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            char charOfS = s.charAt(i);
            char charOfT = t.charAt(i);

            Character c = map.get(charOfS);
            if (c == null) {
                map.put(charOfS, charOfT);
            }
            if (c != null && !c.equals(charOfT)) {
                return false;
            }

            Character rc = rMap.get(charOfT);
            if (rc == null) {
                rMap.put(charOfT, charOfS);

            }
            if (rc != null && !rc.equals(charOfS)) {
                return false;
            }
        }
        return true;
    }
}
