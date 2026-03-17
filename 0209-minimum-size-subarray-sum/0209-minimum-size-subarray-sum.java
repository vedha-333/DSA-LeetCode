class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //LEFT POINTER OF THE SLIDING WINDOW 
        int left = 0 ;

        // STRORE THE SUM OF THE CURRENT WINDOW 
        int sum = 0 ;

        //I HAVE GIVEN THE VALUE FOR minLength is Integer.MAX_VALUE BECAUSE IT SHOULD STORE MIN LENGTH OF THE SLIDING WINDOW 
        int minLength = Integer.MAX_VALUE ;

        // RIGHT POINTER EXPANDS THE WINDOW 
        for (int right = 0 ; right < nums.length ; right++){
            // ADD CURRENT ELEMENT TO THE WINDOW 
            sum += nums[right];

           // IF SUM OF THE ELEMENT OF CURRENT ELEMENT IS MORE OR EQUAL TO THE TARGET THEN IT WILL EXECUTE THE WHILE LOOP 
           // TRY TO SKRINK THE WINDOW TO GET THE MINLENGTH 
            while (sum >= target){

                // UPDATE THE MIN LENGTH OF THE MINUMIN SUBARRAY 
                //RIGHT - LEFT +1 GIVE THE CURRENT WINDOWS SIZE
                minLength = Math.min(minLength , right - left +1);

                // REMOVE THE LEFTMOST ELEMENT FROM SUM 
                sum -= nums[left];

                // MOVE THE LEFT POINTER FROWARD TO SKRINK THE WINDOW 
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE)? 0 : minLength ;
    }
}