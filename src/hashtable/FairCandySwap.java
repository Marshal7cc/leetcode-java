package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Marshal
 * @date 2021/2/1
 */
public class FairCandySwap {
    public int[] fairCandySwapViolence(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();

        int[] ans = new int[2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (sumA - A[i] + B[j] == sumB + A[i] - B[j]) {
                    ans[0] = A[i];
                    ans[1] = B[j];
                    return ans;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public int[] fairCandyHashTable(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;

        Set<Integer> bSet = new HashSet<>();
        for (int b : B) {
            bSet.add(b);
        }

        int[] ans = new int[2];
        for (int a : A) {
            int b = a - delta;
            if (bSet.contains(b)) {
                ans[0] = a;
                ans[1] = b;
                break;
            }
        }
        return ans;
    }
}
