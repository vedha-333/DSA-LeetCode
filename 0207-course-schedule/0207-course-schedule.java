class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // adjacency list
        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        // build graph
        for (int[] p : prerequisites) {

            int course = p[0];
            int prereq = p[1];

            graph[prereq].add(course);
        }

        // 0 = unvisited
        // 1 = visiting
        // 2 = visited
        int[] state = new int[numCourses];

        // check every course
        for (int i = 0; i < numCourses; i++) {

            if (!dfs(graph, state, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(List<Integer>[] graph, int[] state, int node) {

        // cycle found
        if (state[node] == 1) {
            return false;
        }

        // already processed
        if (state[node] == 2) {
            return true;
        }

        // mark visiting
        state[node] = 1;

        // visit neighbors
        for (int nei : graph[node]) {

            if (!dfs(graph, state, nei)) {
                return false;
            }
        }

        // mark visited
        state[node] = 2;

        return true;
    }
}