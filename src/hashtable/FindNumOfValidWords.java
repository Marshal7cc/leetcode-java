package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/2/27
 */
public class FindNumOfValidWords {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        // 计算每个词的状态值
        // 不同的词状态值可能一致
        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); ++i) {
                char ch = word.charAt(i);
                mask |= (1 << (ch - 'a'));
            }
            if (Integer.bitCount(mask) <= 7) {
                frequency.put(mask, frequency.getOrDefault(mask, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (String puzzle : puzzles) {
            // 枚举puzzle的所有状态子集
            int total = 0;

            // 枚举二进制子集标准范式
//            int mask = 8;
//            int sub = mask;
//            do {
//                sub = (sub - 1) & mask;
//                System.out.println(sub);
//            } while (sub != mask);

            int mask = 0;
            for (int i = 1; i < 7; ++i) {
                mask |= (1 << (puzzle.charAt(i) - 'a'));
            }
            int subset = mask;
            do {
                // 首先将puzzle[0]对应的二进制位标1
                int s = subset | (1 << (puzzle.charAt(0) - 'a'));
                if (frequency.containsKey(s)) {
                    total += frequency.get(s);
                }
                subset = (subset - 1) & mask;
            } while (subset != mask);

            ans.add(total);
        }
        return ans;
    }
}
