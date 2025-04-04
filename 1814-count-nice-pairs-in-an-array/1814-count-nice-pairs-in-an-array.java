import java.util.HashMap;
import java.util.Map;

class Solution {
    int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int count = 0, MOD = 1_000_000_007;

        for (int num : nums) {
            int diff = num - reverse(num);
            int freq = hmap.getOrDefault(diff, 0);
            
            count = (count + freq) % MOD;  // Increment count based on existing pairs
            hmap.put(diff, freq + 1);  // Update frequency
        }
        return count;
    }
}
