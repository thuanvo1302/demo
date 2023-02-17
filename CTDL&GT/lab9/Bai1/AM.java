import java.util.LinkedList;
import java.util.Queue;

public class AM {
  private int[][] adj;
  private final int NUMBER_OF_VERTICES;

  public AM(int numberOfVertices) {
    NUMBER_OF_VERTICES = numberOfVertices;
    adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
  }

  public int size() {
    return NUMBER_OF_VERTICES;
  }


  public void setEdge(int vertexSource, int vertexDestination, int weight) {
    try {
      adj[vertexSource][vertexDestination] = weight;
      adj[vertexDestination][vertexSource] = weight;
    } catch (ArrayIndexOutOfBoundsException indexBounce) {
      System.out.println("The vertices does not exists");
    }
  }

  public int getEdge(int vertexSource, int vertexDestination) {
    try {
      return adj[vertexSource][vertexDestination];
    } catch (ArrayIndexOutOfBoundsException indexBounce) {
      System.out.println("The vertices does not exists");
    }
    return -1;
  }

  public void printGraph() {
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void BFS(int s) {
    boolean[] visited = new boolean[NUMBER_OF_VERTICES];
    Queue<Integer> queue = new LinkedList<Integer>();
    visited[s] = true;

    queue.add(s);
    while (!queue.isEmpty()) {
      s = queue.poll();
      System.out.print(s + " ");
      for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
        if (adj[s][i] == 1 && !visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }

  public void DFS_recur(int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(v + " ");
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      if (adj[v][i] == 1 && !visited[i]) {
        DFS_recur(i, visited);
      }
    }
  }

  public void DFS(int v) {
    boolean[] visited = new boolean[NUMBER_OF_VERTICES];
    DFS_recur(v, visited);
  }
}