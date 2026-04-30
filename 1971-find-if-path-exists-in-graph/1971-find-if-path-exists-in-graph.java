class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == destination) {
                return true;
            }

            for (int neighbor : graph[node]) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        return false;
    }
}