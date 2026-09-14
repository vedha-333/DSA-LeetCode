class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0 ;
        for (int i =0 ; i < nums.length ; i++){
            totalSum += nums[i] ;
        }
        int actualSum = nums.length * (nums.length + 1) / 2;

        int missingElement = actualSum - totalSum;
        return missingElement; 
    }
}