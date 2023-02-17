import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static int countVertices(AM graph) {
        Set<Integer> vertices = new HashSet<Integer>();
        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.size(); j++) {
                if (graph.getEdge(i, j) != 0) {
                    vertices.add(i);
                    vertices.add(j);
                }
            }
        }
        return vertices.size();
    }

    public static int countEdges(AM graph) {
        int count = 0;
        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.size(); j++) {
                if (graph.getEdge(i, j) != 0) {
                    count++;
                }
            }
        }
        return count / 2;
    }

    public static ArrayList<Integer> neighbors(int u, AM adj) {
        ArrayList<Integer> neighbors = new ArrayList<Integer>();
        for (int i = 0; i < adj.size(); i++) {
            if (adj.getEdge(u - 1, i) != 0) {
                neighbors.add(i + 1);
            }
        }
        return neighbors;
    }

    public static boolean exists(AM adj, int u, int v) {
        return adj.getEdge(u - 1, v - 1) != 0;
    }

    public static void main(String[] args) {
        AM adj = new AM(7);

        int[][] graph = {
                { 0, 1, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 0, 0 },
                { 1, 1, 0, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 1, 0 } };
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                adj.setEdge(i, j, graph[i][j]);
            }
        }
        adj.printGraph();
        System.out.println("Number of vertices: " + countVertices(adj));
        System.out.println("Number of edges: " + countEdges(adj));

        System.out.println("Neighbors of 2: " + neighbors(2, adj));

        System.out.println("Exists 2-3: " + exists(adj, 2, 3));
        System.out.println("Exists 3-7: " + exists(adj, 3, 7));

    }

}