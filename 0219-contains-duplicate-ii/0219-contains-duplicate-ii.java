import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // if already seen → duplicate found
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // keep only last k elements
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}