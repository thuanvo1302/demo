import java.io.*;
// import java.util.*;

public class MyAVL {
    Node root;

    public MyAVL() {
        root = null;
    }

    public int height() {
        return height(root);
    }

    private int height(Node x) {

        if (x == null) {
            return -1;
        }

        return x.height;
    }

    private int checkBalance(Node x) {
        return height(x.left) - height(x.right);
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node balance(Node x) {
        if (checkBalance(x) < -1) { // left < right => right
            if (checkBalance(x.right) > 0) { // left > right => left
                // right left
                x.right = rotateRight(x.right);
            }
            // right right
            x = rotateLeft(x);
        } else if (checkBalance(x) > 1) { // left > right => left
            if (checkBalance(x.left) < 0) { // left < right => right
                // left right
                x.left = rotateLeft(x.left);
            }
            // left left
            x = rotateRight(x);
        }
        return x;
    }

    public int sum() {
        return sum(root);
    }

    private int sum(Node x) {
        if (x == null) {
            return 0;
        }
        return x.key + sum(x.left) + sum(x.right);
    }

    public void insert(Integer key) {
        root = insertRecursive(root, key);
        // root = balance(root);
    }

    private Node insertRecursive(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = insertRecursive(x.left, key);
        } else if (cmp > 0) {
            x.right = insertRecursive(x.right, key);
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));

        return balance(x);
    }

    // Pre-Order
    public void NLR(Node x, PrintWriter writer) {
        if (x != null) {
            // System.out.println(x.key);
            writer.print(x.key + " ");
            NLR(x.left, writer);
            NLR(x.right, writer);
        }
    }

    // In-order
    public void LNR(Node x, PrintWriter writer) {
        if (x != null) {
            LNR(x.left, writer);
            // System.out.println(x.key);
            writer.print(x.key + " ");
            LNR(x.right, writer);
        }
    }

    private void printAscending(Node x) {
        if (x != null) {
            printAscending(x.left);
            System.out.print(x.key + " ");
            printAscending(x.right);
        }
    }

    public void printAscending() {
        printAscending(root);
    }

    private void printDescending(Node x) {
        if (x != null) {
            printDescending(x.right);
            System.out.print(x.key + " ");
            printDescending(x.left);
        }
    }

    public void printDescending() {
        printDescending(root);
    }

    // Post-order
    public void LRN(Node x, PrintWriter writer) {
        if (x != null) {
            LRN(x.left, writer);
            LRN(x.right, writer);
            // System.out.println(x.key);
            writer.print(x.key + " ");
        }
    }

    public Node search(Integer key) {
        return searchRecursive(root, key);
    }

    private Node searchRecursive(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            return searchRecursive(x.left, key);
        } else if (cmp > 0) {
            return searchRecursive(x.right, key);
        } else {
            return x;
        }
    }

    public boolean contains(Integer key) {

        return search(key) != null;
    }

    public Node finMinNode() {
        return findMinNodeRecursive(root);
    }

    private Node findMinNodeRecursive(Node x) {
        if (x == null) {
            return null;
        }
        if (x.left == null) {
            return x;
        }
        return findMinNodeRecursive(x.left);
    }

    public Node findMax() {
        return findMaxNodeRecursive(root);
    }

    private Node findMaxNodeRecursive(Node x) {
        if (x == null) {
            return null;
        }
        if (x.right == null) {
            return x;
        }
        return findMaxNodeRecursive(x.right);
    }

    public void deleteMin() {
        root = deleteMinRecursive(root);
    }

    private Node deleteMinRecursive(Node x) {
        if (x == null) {
            return null;
        }

        if (x.left == null) {
            return x.right;
        } else {
            x.left = deleteMinRecursive(x.left);
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));
        return balance(x);
    }

    public void deleteMax() {
        root = deleteMaxRecursive(root);
    }

    private Node deleteMaxRecursive(Node x) {
        if (x == null) {
            return null;
        }

        if (x.right == null) {
            return x.left;
        } else {
            x.right = deleteMaxRecursive(x.right);
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));

        return balance(x);
    }

    public void delete(Integer key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = deleteRecursive(x.left, key);
        } else if (cmp > 0) {
            x.right = deleteRecursive(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }

            x.key = findMinNodeRecursive(x.right).key;

            x.right = deleteMinRecursive(x.right);
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));

        return balance(x);
    }

    public void delete_pre(Integer key) {
        root = deletePreRecursive(root, key);
    }

    private Node deletePreRecursive(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = deletePreRecursive(x.left, key);
        } else if (cmp > 0) {
            x.right = deletePreRecursive(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }

            x.key = findMaxNodeRecursive(x.left).key;
            x.left = deleteMaxRecursive(x.left);
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));

        return balance(x);
    }

}