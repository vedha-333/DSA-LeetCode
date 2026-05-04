class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level =1 ;

        while(!q.isEmpty()){
            for (int s = q.size() ; s > 0 ; s--){
                String word = q.poll();
                if(word.equals(endWord)) return level ;
                char[] arr = word.toCharArray();

                for(int i = 0 ; i < arr.length ; i++){
                    char org = arr[i];
                    for (char ch ='a' ; ch <= 'z' ; ch++ ){
                        arr[i] = ch;
                        String newWord = new String(arr);
                        if(set.contains(newWord)){
                            q.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    arr[i] = org;
                }
            }
            level++;
        }
        return 0;
    }
}