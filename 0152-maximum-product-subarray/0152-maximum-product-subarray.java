class Solution {
    public int maxProduct(int[] nums) {
        int productMax = Integer.MIN_VALUE ;
        int perfix = 1 , suffix = 1 ;

        for (int i = 0 ; i < nums.length ; i++){
            if(perfix == 0) perfix = 1 ;
            if (suffix == 0) suffix = 1 ;

            perfix *= nums[i] ;
            suffix *= nums[nums.length-i-1];

            productMax = Math.max (productMax , Math.max(perfix , suffix)); 
        }

        return productMax ;
    }
}