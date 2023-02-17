public class Test {
    public static void main(String[] args) {
        AL adj = new AL(7);
        adj.addEdge(1, 2);
        adj.addEdge(1, 3);
        adj.addEdge(2, 1);
        adj.addEdge(2, 3);
        adj.addEdge(2, 4);
        adj.addEdge(3, 1);
        adj.addEdge(3, 2);
        adj.addEdge(3, 5);
        adj.addEdge(4, 2);
        adj.addEdge(4, 5);
        adj.addEdge(5, 3);
        adj.addEdge(5, 4);
        adj.addEdge(5, 6);
        adj.addEdge(6, 5);
        adj.addEdge(6, 7);
        adj.addEdge(7, 6);

        adj.printGraph();

        System.out.println("Number of vertices = " + adj.countVertices());
        adj.neighbors(2);
        System.out.println();
        System.out.println(adj.existence(6, 7));
    }

}
