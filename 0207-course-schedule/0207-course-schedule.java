class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0 ;  i < numCourses ; i++){
            graph[i] = new ArrayList<>();
        }

        for (int[] p : prerequisites){
            int course = p[0];
            int preq = p[1];
            graph[preq].add(course);
        }

        int[] state = new int[numCourses];
        for (int i = 0 ; i < numCourses ; i++){
            if (!dfs(graph , state , i)){
                return false ;
            }
        }
        return true ;
    }

    public boolean dfs(List<Integer>[] graph , int[] state , int node ){
        if (state[node] == 1){
            return false ;
        }
        if (state[node] == 2){
            return true ;
        }

        state[node] = 1 ;

        for (int neighbour : graph[node]){
            if (!dfs(graph , state , neighbour)) return false ;
        }

        state[node] = 2 ;

        return true ;
    }
}