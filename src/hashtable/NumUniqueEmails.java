package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marshal
 * @since 2022/6/4
 */
public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf("@");
            String local = email.substring(0, i).split("\\+")[0].replace(".", "");
            ans.add(local + email.substring(i));
        }
        return ans.size();
    }
}
