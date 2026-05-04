class Solution {
    public boolean isBipartite(int[][] graph) {
     int n = graph.length; 
     int[] colour = new int[n];

     for (int i = 0 ; i < n ; i++){
        if (colour[i] == 0){
            if(!dfs(graph , colour , i , 1)){
                return false ;
            }
        }
     }
     return true ;  
    }

    public boolean dfs (int[][] graph , int[] colour , int node , int c){
        colour[node] = c ;

        for (int neighbour : graph[node]){
            if (colour[neighbour] == 0){
                if(!dfs(graph , colour , neighbour , -c)) return false ;
            }else if (colour[neighbour] == c){
                return false ;
            }
        }

        return true ;
    }
}