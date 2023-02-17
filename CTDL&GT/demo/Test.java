
class Test {

    public static void SelectionSort(int[] a) {
        for (int i = a.length - 1; i >= 1; i--) {
            int index = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[index]) {
                    index = j;
                }
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }

    public static void BubbleSort(int[] a) {

    }

    public static void InsertionSort(int[] a) {

    }

    public static void main(String[] args) {
        int[] a = { 5, 8, 1, 2, 3, 9, 0, 5, 7 };
        SelectionSort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        BubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        InsertionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}