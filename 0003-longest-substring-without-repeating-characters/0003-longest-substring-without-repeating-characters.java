class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int maxlength = 0 ;

        HashSet<Character> seen = new HashSet<>();

        for (int right = 0 ; right < s.length() ; right++ ){
            char currentChar = s.charAt(right);

            while (seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            maxlength = Math.max(maxlength ,right-left +1);
        }
        return maxlength;

    }
}