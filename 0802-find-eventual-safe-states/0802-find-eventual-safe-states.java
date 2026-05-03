class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        // 0 = unvisited
        // 1 = visiting
        // 2 = safe
        int[] color = new int[n];

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (dfs(graph, color, i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean dfs(int[][] graph, int[] color, int node) {

        // already processed
        if (color[node] != 0) {

            // safe only if color == 2
            return color[node] == 2;
        }

        // mark visiting
        color[node] = 1;

        for (int nei : graph[node]) {

            // if neighbor unsafe
            if (!dfs(graph, color, nei)) {
                return false;
            }
        }

        // all neighbors safe
        color[node] = 2;

        return true;
    }
}