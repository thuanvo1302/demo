public class Main {
    // Ex 7.a
    public static int findMin(int[] a, int size) {
        if (size == 1)
            return a[0];
        else {
            int min = a[1];
            for (int i = 1; i <= size; i++) {
                if (a[i] < min)
                    min = a[i];
            }
            return min;
        }
    }

    public static int findMinElementOfArray(int[] array, int size) {
        if (size == 1)
            return array[0];
        else {
            return (array[size] < findMinElementOfArray(array, size - 1)) ? array[size]
                    : findMinElementOfArray(array, size - 1);
        }
    }

    // Ex 7.b
    public static int findSum(int[] array, int size) {
        if (size == 1)
            return array[0];
        else {
            return (array[size - 1] + findSum(array, size - 1));
        }
    }

    // Ex 7.c
    public static int countEvenNumber(int[] array, int index) {
        if (index == array.length)
            return 0;
        else {
            int countEven = 0;
            if ((array[index] % 2) == 0) {
                countEven += 1;
            }
            return countEven + countEvenNumber(array, index + 1);
        }

    }

    public static void main(String[] args) {
        int array[] = { 20, 10, 15, 5, 25 };
        int size = array.length - 1;
        // Ex 7.a
        int smallest = findMinElementOfArray(array, size);
        System.out.println("7.(a)\nSmallest element of array: " + smallest);
        // Ex 7.b
        int sum = findSum(array, 5);
        System.out.println("7.(b)\nSum of array values: " + sum);
        // Ex 7.c
        System.out.println("7.(c)\nThere are " + countEvenNumber(array, 0) + " even numbers in the array.");

    }
}