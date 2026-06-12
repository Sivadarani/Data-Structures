import java.util.*;
class GraphMatrix {
    private int vertices;
    private int[][] matrix;
    // Constructor
    GraphMatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    // Add Edge
    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1; // remove this line for directed graph
    }

    // Remove Edge
    void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }

    // Print Graph
    void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.printGraph();
        g.removeEdge(2, 0);
        g.printGraph();
    }
}
