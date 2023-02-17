import java.util.NoSuchElementException;

public class MinHeap {
    private int[] heap;
    private int heapSize;
    private int maxSize;

    public MinHeap(int capity) {
        this.heapSize = 0;
        this.maxSize = capity;
        heap = new int[maxSize];
        heap[0] = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public void insert(int key) {
        if (heapSize == maxSize) {
            throw new NoSuchElementException();
        }
        heapSize += 1;
        heap[heapSize] = key;
        shiftDown(heapSize);
    }

    private void shiftUp(int i) {
        while (i > 1 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    private void shiftDown(int i) {
        while (i <= heapSize) {
            int max = heap[i];
            int max_id = i;
            if (left(i) <= heapSize && max < heap[left(i)]) {
                max = heap[left(i)];
                max_id = left(i);
            }
            if (right(i) <= heapSize && max < heap[right(i)]) {
                max = heap[right(i)];
                max_id = right(i);
            }
            if (max_id != i) {
                swap(max_id, i);
                i = max_id;
            } else {
                break;
            }
        }
    }

    public int extractMax() {
        if (heapSize == 0) {
            throw new NoSuchElementException();
        }
        int max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftUp(1);
        return max;
    }

    public void print() {

        for (int i = 0; i < heapSize / 2; i++) {

            System.out.print("Parent Node : " + heap[i]);

            if (left(i) < heapSize) // if the child is out of the bound
                // of the array
                System.out.print(" Left Child Node: " + heap[left(i)]);

            if (right(i) < heapSize) // if the right child index must not
                // be out of the index of the array
                System.out.print(" Right Child Node: " + heap[right(i)]);

            System.out.println(); // for new line
        }
    }
}
