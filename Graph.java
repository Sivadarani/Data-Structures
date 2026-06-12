import java.util.*;

class Graph {

    int vertices;
    ArrayList<LinkedList<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public void printGraph() {

        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public void bfs(int start) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);

        System.out.print("\nBFS : ");

        while (!queue.isEmpty()) {

            int vertex = queue.poll();

            System.out.print(vertex + " ");

            for (int neighbor : adjList.get(vertex)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int start) {

        boolean[] visited = new boolean[vertices];

        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

        stack.push(start);

        System.out.print("DFS : ");

        while (!stack.isEmpty()) {

            int vertex = stack.pop();

            if (!visited[vertex]) {

                visited[vertex] = true;

                System.out.print(vertex + " ");

                LinkedList<Integer> neighbors = adjList.get(vertex);

                for (int i = neighbors.size() - 1; i >= 0; i--) {

                    int neighbor = neighbors.get(i);

                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();

        g.bfs(0);

        g.dfs(0);
    }
}