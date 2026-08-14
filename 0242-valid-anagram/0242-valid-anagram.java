class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] charss = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charss);
        String word = new String(chars);
        String words = new String(charss);
        if (word.equals(words)){
            return true ;
        }else {
            return false ;
        }

    }
}