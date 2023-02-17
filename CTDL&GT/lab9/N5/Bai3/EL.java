
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class EL {
    private Vector<IntegerTriple> edges;

    public EL() {
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int u, int v) {
        edges.add(new IntegerTriple(w, u, v));
    }

    public void printGraph() {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }

    public int countEdges() {
        int count = 0;
        for (int i = 0; i < edges.size(); i++) {
            count++;
        }
        return count;
    }

    public int countVertices() {
        int i = 0;
        int length = countEdges();
        Set<Integer> s = new LinkedHashSet<Integer>();
        while (i < length) {
            s.add(edges.get(i).getSource());
            s.add(edges.get(i).getDest());
            i++;
        }
        return s.size();
    }

    public void neighbors(int u) {
        int i = 0;
        int length = countEdges();
        Set<Integer> s = new LinkedHashSet<Integer>();
        while (i < length) {
            if (u == edges.get(i).getSource()) {
                s.add(edges.get(i).getDest());
            }
            if (u == edges.get(i).getDest()) {
                s.add(edges.get(i).getSource());
            }
            i++;
        }
        System.out.println(s);
    }

    public boolean existence(int u, int v) {
        int i = 0;
        while (i < countEdges()) {
            if (u == edges.get(i).getSource() && v == edges.get(i).getDest())
                return true;
            i++;
        }
        return false;
    }
}
