class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0 ; 
        for (int i = 0 ; i < nums.length  ; i++){
            actualSum += nums[i];
        }

        int exceptedSum = nums.length * (nums.length + 1 ) / 2;
        int missingNumber = exceptedSum - actualSum ;

        return missingNumber ;
        
    }
}