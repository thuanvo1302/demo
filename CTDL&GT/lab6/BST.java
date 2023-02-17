public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    private Node insert_Recur(Node x, Integer key) {
        if (x == null)
            return new Node(key);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = insert_Recur(x.left, key);
        } else if (cmp > 0) {
            x.right = insert_Recur(x.right, key);
        } else {
            x.key = key;
        }
        return x;

    }

    public void insert(int key) {
        root = insert_Recur(root, key);
    }

    private void LNR_Recur(Node x) {
        if (x != null) {
            LNR_Recur(x.left);
            System.out.print(x.key + " ");
            LNR_Recur(x.right);
        }
    }

    public void LNR() {
        LNR_Recur(root);
    }

    public void ascending() {
        LNR_Recur(root);
    }

    private void LRN_Recur(Node x) {
        if (x != null) {
            LRN_Recur(x.left);
            LRN_Recur(x.right);
            System.out.print(x.key + " ");
        }
    }

    public void LRN() {
        LRN_Recur(root);
    }

    private void NLR_Recur(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR_Recur(x.left);
            NLR_Recur(x.right);
        }
    }

    public void NLR() {
        NLR_Recur(root);
    }

    private Node search_Recur(Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return search_Recur(x.left, key);
        } else if (cmp > 0) {
            return search_Recur(x.right, key);
        } else {
            return x;
        }
    }

    public boolean contains(Integer key) {
        Node tmp = search_Recur(root, key);
        if (tmp != null)
            return true;
        else
            return false;

    }

    private Node min_Recur(Node x) {
        if (x.left == null)
            return x;
        else
            return min_Recur(x.left);
    }

    public void min() {
        Node tmp = min_Recur(root);
        System.out.println(tmp.key);
    }

    private Node max_Recur(Node x) {
        if (x.right == null)
            return x;
        else
            return max_Recur(x.right);
    }

    public void max() {
        Node tmp = max_Recur(root);
        System.out.println(tmp.key);
    }

    private void decending_Recur(Node x) {
        if (x != null) {
            decending_Recur(x.right);

            System.out.print(x.key + " ");
            decending_Recur(x.left);
        }
    }

    public void decending() {
        decending_Recur(root);
    }

    private int height_Recur(Node x) {
        if (x == null)
            return -1;
        else if (x.left == null && x.right == null)
            return 0;
        else {
            int l = 1 + height_Recur(x.left);
            int r = 1 + height_Recur(x.right);
            if (l > r) {
                return l;
            } else {
                return r;
            }
        }

    }

    public int height() {
        int res = height_Recur(root);
        return res;
    }

    private Integer sum_Recur(Node x) {
        int tmp = x.key;

        if (x.left != null && x.right != null) {

            tmp = tmp + sum_Recur(x.left) + sum_Recur(x.right);
        }
        return tmp;
    }

    public Integer sum() {
        int res = sum_Recur(root);
        return res;
    }

    public Integer sumSubtree() {
        return sum_Recur(root.left) + sum_Recur(root.right);

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

        return x;
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

        return x;
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

            x.key = min_Recur(x.right).key;

            x.right = deleteMinRecursive(x.right);
        }
        return x;
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

            x.key = max_Recur(x.left).key;
            x.left = deleteMaxRecursive(x.left);
        }
        return x;
    }

}
