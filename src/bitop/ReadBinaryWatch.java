package bitop;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/6/21
 */
public class ReadBinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < 1024; i++) {
            int h = i >> 6;
            int m = i & 63;

            if (h < 12 && m < 60 && Integer.bitCount(i) == turnedOn) {
                ans.add(h + ":" + (m < 10 ? "0" : "") + m);
            }
        }
        return ans;
    }
}
