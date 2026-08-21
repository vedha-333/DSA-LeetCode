class Solution {
    public int pivotIndex(int[] nums) {
        int suffixSum = 0 ;
        for (int i = 1 ; i < nums.length ; i++){
            suffixSum += nums[i];
        }

        int prefixSum = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (prefixSum == suffixSum){
                return i;
            }
            prefixSum += nums[i];
            if (i+1 < nums.length){
                suffixSum -= nums[i+1];
            }
        }
        return -1;
    }
}