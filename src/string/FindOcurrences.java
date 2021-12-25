package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2021/12/26
 */
public class FindOcurrences {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> ans = new ArrayList<>();

        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2].equals(first) && arr[i - 1].equals(second)) {
                ans.add(arr[i]);
            }
        }

        String[] res = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
