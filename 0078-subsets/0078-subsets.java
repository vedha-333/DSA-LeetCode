import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        // Add the current subset (deep copy)
        result.add(new ArrayList<>(path));
        
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);           // Choose
            backtrack(nums, i + 1, path, result);  // Explore
            path.remove(path.size() - 1); // Unchoose (backtrack)
        }
    }
}