package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/2/12
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>(rowIndex);

        // 这里i<=rowIndex,因为是索引k,返回的应该是第k+1行
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> res = new ArrayList<>(rowIndex);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    res.add(1);
                } else {
                    // 递推
                    res.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = res;
        }
        return pre;
    }
}
