class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE ;
        int countSum = 0 ;

        for (int i = 0 ; i < nums.length ; i++){
            countSum += nums[i] ;
            if (countSum > sum){
                sum = countSum ;
            }

            if (countSum < 0){
                countSum = 0 ;
            }
        }

        return sum ;
        
    }
}