class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];

        List<Integer> ans = new ArrayList<>();

        for (int i = 0  ; i< n ; i++){
            if (dfs (graph , colour , i)){
                ans.add(i);
            }
        }
        return ans ;
    }

    public boolean dfs(int[][] graph , int[] colour , int node){
        if (colour[node] != 0 ){
            return colour[node] == 2 ;
        }

        colour[node] = 1 ;

        for (int neighbour : graph[node]){
            if (!dfs(graph , colour , neighbour)) return false ;
        }

        colour[node] = 2;

        return true ;
    }
}