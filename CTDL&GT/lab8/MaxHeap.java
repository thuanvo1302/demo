// import java.util.NoSuchElementException;

// public class MaxHeap {
//     private int[] heap;
//     private int heapSize;
//     private int maxSize;

//     public MaxHeap(int capity) {
//         this.heapSize = 0;
//         this.maxSize = capity + 1;
//         heap = new int[maxSize];
//         heap[0] = -1;
//     }

//     private int parent(int i) {
//         return (i - 1) / 2;
//     }

//     private int left(int i) {
//         return 2 * i + 1;
//     }

//     private int right(int i) {
//         return 2 * i + 2;
//     }

//     private void swap(int i, int j) {
//         int tmp = heap[i];
//         heap[i] = heap[j];
//         heap[j] = tmp;
//     }

//     public void insert(int key) {
//         if (heapSize == maxSize) {
//             throw new NoSuchElementException();
//         }
//         heapSize += 1;
//         heap[heapSize] = key;
//         shiftUp(heapSize);
//     }

//     private void shiftUp(int i) {
//         while (i > 1 && heap[parent(i)] < heap[i]) {
//             swap(parent(i), i);
//             i = parent(i);
//         }
//     }

//     private void shiftDown(int i) {
//         while (i <= heapSize) {
//             int max = heap[i];
//             int max_id = i;
//             if (left(i) <= heapSize && max < heap[left(i)]) {
//                 max = heap[left(i)];
//                 max_id = left(i);
//             }
//             if (right(i) <= heapSize && max < heap[right(i)]) {
//                 max = heap[right(i)];
//                 max_id = right(i);
//             }
//             if (max_id != i) {
//                 swap(max_id, i);
//                 i = max_id;
//             } else {
//                 break;
//             }
//         }
//     }

//     public int extractMax() {
//         if (heapSize == 0) {
//             throw new NoSuchElementException();
//         }
//         int max = heap[0];
//         heap[0] = heap[heapSize];
//         heapSize -= 1;
//         shiftDown(1);
//         return max;
//     }

//     public void print() {

//         for (int i = 0; i < heapSize / 2 + 1; i++) {

//             System.out.print("Parent Node : " + heap[i]);

//             if (left(i) < heapSize) // if the child is out of the bound
//                 // of the array
//                 System.out.print(" Left Child Node: "
//                         + heap[left(i)]);

//             if (right(i) < heapSize) // if the right child index must not
//                 // be out of the index of the array
//                 System.out.print(" Right Child Node: "
//                         + heap[right(i)]);

//             System.out.println(); // for new line
//         }
//     }
// }

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    // Constructor to initialize an
    // empty max heap with given maximum
    // capacity
    public MaxHeap(int maxsize) {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    // Method 1
    // Returning position of parent
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // Method 2
    // Returning left children
    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    // Method 3
    // Returning right children
    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    // Method 4
    // Returning true of given node is leaf
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    // Method 5
    // Swapping nodes
    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Method 6
    // Recursive function to max heapify given subtree
    private void maxHeapify(int pos) {
        if (isLeaf(pos))
            return;

        if (Heap[pos] < Heap[leftChild(pos)]
                || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Method 7
    // Inserts a new element to max heap
    public void insert(int element) {
        Heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    // Method 8
    // To display heap
    public void print() {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + Heap[i]);

            if (leftChild(i) < size) // if the child is out of the bound
                                     // of the array
                System.out.print(" Left Child Node: "
                        + Heap[leftChild(i)]);

            if (rightChild(i) < size) // if the right child index must not
                                      // be out of the index of the array
                System.out.print(" Right Child Node: "
                        + Heap[rightChild(i)]);

            System.out.println(); // for new line
        }
    }

    // Method 9
    // Remove an element from max heap
    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        maxHeapify(0);
        return popped;
    }

    // Method 10
    // main dri er method

}