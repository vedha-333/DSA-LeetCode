class Solution {
    public int maxSubArray(int[] nums) {
        int maxCount = Integer.MIN_VALUE ;
        int currCount= 0 ;

        for (int i = 0 ; i < nums.length ; i++){
            currCount += nums[i];
            maxCount = Math.max(maxCount , currCount);
            if (currCount < 0 ){
                currCount = 0 ;
            }
        }

        return maxCount ;
    }
}