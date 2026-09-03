class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 , right = 0 ;
        int sum =0 , minLength = Integer.MAX_VALUE ;

        while (right < nums.length ){
            sum += nums[right];
            while (sum >= target ){
                sum -= nums[left];
                minLength = Math.min(minLength , right - left + 1);
                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength  ;
    }
}