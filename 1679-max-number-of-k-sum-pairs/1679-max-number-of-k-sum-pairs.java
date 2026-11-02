class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count =0;

        int left = 0 ;
        int right = nums.length -1 ;
        boolean[] used = new boolean[nums.length];

        while (left < right){
            int sum = nums[left] + nums[right] ;


            if (sum == k ){
                count++ ;
                used[left] = true ;
                used[right] = true ;
                left++;
                right--;
            }else if (sum < k){
                left++;
            }else {
                right--;
            }
        }
        return count ;
    }
}