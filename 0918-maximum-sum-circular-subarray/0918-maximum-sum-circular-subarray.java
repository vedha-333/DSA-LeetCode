class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0 ;

        int maxCount = Integer.MIN_VALUE ;
        int currMax = 0 ;

        int minCount = Integer.MAX_VALUE ;
        int currMin = 0 ;

        for (int i = 0 ; i < nums.length ; i++ ){
            totalSum += nums[i] ;

            currMax += nums[i];
            maxCount = Math.max(maxCount, currMax);
            if (currMax < 0 ) currMax = 0;

            currMin += nums[i];
            minCount = Math.min(minCount, currMin);
            if (currMin > 0 ) currMin = 0;
        }

        if (maxCount < 0) return maxCount ;

        return Math.max(maxCount , totalSum - minCount);
    }
}