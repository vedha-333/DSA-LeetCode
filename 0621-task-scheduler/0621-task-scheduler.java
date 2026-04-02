class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        int maxfrequency = 0 , maxfrequencyCount = 0 ;

        for (char task : tasks ){
            maxfrequency = Math.max(maxfrequency , ++frequency[task - 'A']);
        }

        for (int freq : frequency ){
            maxfrequencyCount += freq == maxfrequency ? 1 : 0;
        }

        return Math.max(tasks.length , (maxfrequency -1) * (n + 1) + maxfrequencyCount );
    }
}