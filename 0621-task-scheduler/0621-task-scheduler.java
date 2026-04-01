class Solution {
    public int leastInterval(char[] tasks, int cooldown) {
        int[] frequency = new int[26];
        int maxFrequency = 0, maxFrequencyCount = 0;

        for (char task : tasks)
            maxFrequency = Math.max(maxFrequency, ++frequency[task - 'A']);

        for (int freq : frequency)
            maxFrequencyCount += freq == maxFrequency ? 1 : 0;

        return Math.max(tasks.length, (maxFrequency - 1) * (cooldown + 1) + maxFrequencyCount);
    }
}