class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //if s1 is bigger , no permutation possible
        if (s1.length() > s2.length()) return false;

        // frequency array for s1 and current window 
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        //add character to s1Count
        for (char c : s1.toCharArray()){
            s1Count[c - 'a']++;
        }
        
        //left pointer for window
        int left = 0 ;

        //sliding window over s2
        for (int right = 0 ; right < s2.length() ; right++){
            // counting elements of current window 
            windowCount[s2.charAt(right) - 'a']++;

            //If window size exceeds s1 length, skink it 
            if (right - left +1 > s1.length()){
                windowCount[s2.charAt(left) - 'a']--;
                left++;
            }
            
            //check if window matches s1 frequency 
            if (matches(windowCount , s1Count)){
                return true ;
            }
        }
        return false ;
    }
    //compare two frequency arrays
private boolean matches(int[] a , int[] b){
    for (int i =0 ; i < 26 ; i++){
        if (a[i] != b[i]){
            return false;
            }
    }
return true;
}
}

