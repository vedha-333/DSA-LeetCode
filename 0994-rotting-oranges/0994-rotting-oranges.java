class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length ;
        int column = grid[0].length ;

        int freshFruits = 0;
        Queue<int[]> rottenFruits = new LinkedList<>();
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column; j++){
                if (grid[i][j] == 2){
                    rottenFruits.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    freshFruits++;
                }
            }
        }
        
        int[] dr = {-1 , 1 , 0 , 0 };
        int[] dc = {0 , 0 , -1 , 1};
        int time = 0;

        while (!rottenFruits.isEmpty() && freshFruits > 0){
            int currentSize = rottenFruits.size();

            for (int i = 0 ; i < currentSize ; i++){
                int[] current = rottenFruits.poll();
                int r = current[0];
                int c = current[1];

                for (int d = 0 ; d < 4 ; d++){
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr >= 0 && nr < row && nc >=0 && nc < column){
                        if (grid[nr][nc] == 1){
                            grid[nr][nc] = 2;
                            freshFruits--;
                            rottenFruits.add(new int[]{nr , nc});
                        }
                    }
                }
            }
            time++;
        }
        return freshFruits == 0 ? time : -1;

        
    }
}