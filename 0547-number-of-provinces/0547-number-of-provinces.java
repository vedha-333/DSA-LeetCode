class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0 ;
        
        for (int i = 0 ; i < n ; i++){
            if (!vis[i]){
                count++;
                Queue<Integer> q = new ArrayDeque<>();
                q.offer(i);

                while (!q.isEmpty()){
                    int node = q.poll();
                    for (int j =0 ; j < n ;j++){
                        if (isConnected[node][j] == 1 && !vis[j]){
                            vis[j] = true ;
                            q.offer(j);
                        }
                    }
                }
            }
        }
        return count;
    }
}