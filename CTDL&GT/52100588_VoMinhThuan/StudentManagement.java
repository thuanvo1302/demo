import java.util.*;

public class StudentManagement {
    private AVL tree;
    private Stack<Node> undoState;
    private Stack<Node> redoState;

    public StudentManagement() {
        this.tree = new AVL();
        this.undoState = new Stack<Node>();
        this.redoState = new Stack<Node>();
    }

    private Node clone(Node x) {
        if (x == null) {
            return null;
        }
        Node clone = new Node(x.getData());

        clone.setLeft(clone(x.getLeft()));
        clone.setRight(clone(x.getRight()));
        clone.setHeight(1 + Math.max(height(clone.getLeft()), height(clone.getRight())));
        return (clone);
    }

    public AVL getTree() {
        return this.tree;
    }

    public int height() {
        return height(tree.getRoot());
    }

    private int height(Node node) {
        if (node == null)
            return -1;
        return node.getHeight();
    }

    // Requirement 1
    public boolean addStudent(Student st) {
        // code here

        if (this.tree.contain(st.getId())) {
            return false;
        }
        this.undoState.push(clone(this.tree.getRoot()));
        this.tree.insert(st);

        return true;

    }

    // Requirement 2
    public Student searchStudentById(int id) {
        // code here
        if (this.tree.search(id) != null) {
            Node node = this.tree.search(id);
            return node.getData();
        } else {
            return null;
        }

    }

    // Requirement 3
    public boolean removeStudent(int id) {
        // code here

        if (this.tree.contain(id)) {
            this.undoState.push(clone(this.tree.getRoot()));
            this.tree.delete(searchStudentById(id));

            return true;
        }

        return false;

    }

    // Requirement 4
    public void undo() {
        // code here
        redoState.push(tree.getRoot());
        if (!undoState.empty())
            tree.setRoot(undoState.pop());
    }

    // Requirement 5
    public void redo() {
        // code here

        tree.setRoot(redoState.pop());
    }

    // Requirement 6
    public ScoreAVL scoreTree(AVL tree) {
        // code here
        ScoreAVL sc = new ScoreAVL();
        Queue<Node> q = new LinkedList<>();
        q.add(tree.root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if (curr.getLeft() != null)
                    q.add(curr.getLeft());
                if (curr.getRight() != null)
                    q.add(curr.getRight());
                sc.insert(curr.getData());
            }
        }
        return sc;
    }
}
