class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length -1;
        int maxWater = 0;
        while (left < right){
            int width = right - left ;
            int len;
            if (height[left] < height[right]){
                len = height[left];
                left++;
            }else {
                len = height[right];
                right--;
            }

            int currentWater = width * len ;
            if (currentWater > maxWater){
                maxWater = currentWater;
            }else {
                maxWater = maxWater ;
            }
        }
        return maxWater ;
    }
}