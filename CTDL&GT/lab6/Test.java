public class Test {
    public static void createTree(String strKey) {
        String[] str = strKey.split(" ");
        BST tree = new BST();
        for (String i : str) {
            tree.insert(Integer.parseInt(i));
        }
        tree.LNR();
    }

    public static void main(String[] args) {
        // Ex1
        System.out.println("Ex1 ");
        BST bst = new BST();
        bst.insert(45); // root
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        bst.insert(100);
        System.out.print("BST: ");
        bst.LRN();
        System.out.println();
        System.out.print("Min of BST: ");
        bst.min();
        System.out.print("Max of BST: ");
        bst.max();
        // Ex2
        System.out.println("Ex2: create BST tree ");
        String strKey = "34 90 58 30 56";
        createTree(strKey);
        System.out.println();
        // Ex3
        System.out.println("Ex3: ascending order");
        bst.ascending();
        System.out.println();
        // Ex4
        System.out.println("Ex4: decending order ");
        bst.decending();
        System.out.println();
        // Ex5
        System.out.println("Ex5: contains");
        System.out.println(bst.contains(100));
        // Ex6
        System.out.println("Ex6: deleteMax ");
        bst.deleteMax();
        bst.ascending();
        System.out.println();
        // Ex7
        System.out.println("Ex7: delete_pre ");
        bst.delete_pre(50);
        bst.ascending();
        System.out.println();
        // Ex8
        System.out.println("Ex8: height of BST ");
        System.out.println(bst.height());
        // Ex9
        System.out.println("Ex9: sum of subtree ");
        System.out.println(bst.sumSubtree());
        // Ex10
        System.out.println("Ex10: sum of tree ");
        System.out.println(bst.sum());

    }
}
