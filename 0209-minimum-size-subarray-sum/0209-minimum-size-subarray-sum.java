class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int sum = 0 ;
        int minCount = Integer.MAX_VALUE;

        for (int right = 0 ; right < nums.length ; right++){
            sum += nums[right]; // window expand right side 

            while (sum >= target){
                minCount = Math.min(minCount , right - left +1 );// the subarray size // min 
                sum -= nums[left]; // remove from the sum the left element 
                left++; // srink the left
            }


        }
                    return minCount == Integer.MAX_VALUE ? 0 : minCount ;

    }
}