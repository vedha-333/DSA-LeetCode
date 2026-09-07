class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = piles[0];
        for (int i = 1 ; i < piles.length ; i++){
            if (piles[i] > maxPile){
                maxPile = piles[i];
            }
        }

        int left = 1 ;
        int right = maxPile ;
        int answer= maxPile ;

        while (left <= right){
            int mid = left + (right - left ) / 2 ;
            long totalHours = 0 ;

            for (int j = 0 ; j < piles.length ; j++ ){
                totalHours += (piles[j] + mid -1) /mid;
            }

            if (totalHours <= h){
                answer = mid ;
                right = mid -1 ;
            } else {
                left = mid +1 ;
            }
        }

        return answer ;
        
    }
}