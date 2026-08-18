class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0 , candidate2 = 0 ;
        int count1 = 0 , count2 = 0 ;
        for (int ele : nums){
            if (count1 > 0 && candidate1 == ele){
                count1++;
            }else if (count2 > 0 && candidate2 == ele){
                count2++;
            }else if (count1 == 0 ){
                candidate1 = ele ;
                count1 = 1;
            }else if (count2 == 0){
                candidate2 = ele;
                count2 = 1 ;
            }else {
                count1--;
                count2--;
            }
        }

        count1 = 0 ;
        count2 = 0 ;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (candidate1 != Integer.MIN_VALUE && candidate1 == nums[i]){ 
                count1++;
            }else if(candidate2 != Integer.MIN_VALUE && candidate2 == nums[i] ){
                count2++;
            }
        }
        int threshold = nums.length / 3 ;
        if (count1 > threshold) list.add(candidate1);
        if (count2 > threshold) list.add(candidate2);
        
        return list ;
    }
}