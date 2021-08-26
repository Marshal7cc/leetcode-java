package twopointers;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2021/8/26
 */
public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int n = people.length;
        int ans = 0;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            ans++;
        }

        return ans;
    }
}
