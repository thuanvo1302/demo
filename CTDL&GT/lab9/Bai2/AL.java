import java.util.*;

public class AL {
    private int V; // No. of vertices
    private ArrayList<LinkedList<Integer>> adj;

    public AL(int v) {
        V = v;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i <= v; ++i)
            adj.add(new LinkedList<Integer>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void printGraph() {
        for (int i = 1; i <= V; i++) {
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for (Integer v : adj.get(i)) {
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }

    public int countVertices() {
        int count = 0;
        for (int i = 0; i < V; i++) {
            count++;
        }
        return count;
    }

    public void neighbors(int u) {
        for (int i = 1; i <= V; i++) {
            if (i == u) {
                for (Integer v : adj.get(i)) {
                    System.out.print(v + ", ");
                }
            }
        }
    }

    public boolean existence(int u, int v) {
        for (int i = 1; i <= V; i++) {
            if (i == u) {
                for (Integer j : adj.get(i)) {
                    if (j == v)
                        return true;
                }
            }
        }
        return false;
    }
}