class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] s = strs;
        Map<String,List<String>> m = new HashMap<>();
        for(String x:s){
            char[] c=x.toCharArray();
            Arrays.sort(c);
            m.computeIfAbsent(new String(c),k->new ArrayList<>()).add(x);
        }
        return new ArrayList<>(m.values());
    }
}