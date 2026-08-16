class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstStr = s.toCharArray();
        char[] secondStr = t.toCharArray();

        Arrays.sort(firstStr);
        Arrays.sort(secondStr);

        String first = new String(firstStr);
        String second = new String(secondStr);

        if (first.equals(second)){
            return true ;
        }else{
            return false ;
    }}
}