public class Main2 {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minpos]){
                    minpos = j;
                }
            }
            int tmp = arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=tmp;
        }
        for (int i : arr) {
            System.out.print( i + " => ");
        }
    }
    
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if(arr[i]<arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print( i + " => ");
        }
    }

    public static void insertedSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<curr){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=curr;

        }
        for (int i : arr) {
            System.out.print( i + " => ");
        }
    }
    
    private static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        //tmp arr
        int L[] = new int [n1];
        int R[] = new int [n2];
        //copy data to tmp array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+1];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr [m+1+j];
        }
        // merge the temp arr
        //initial indeces of first and second sub-arrays
        int i=0, j=0;
        //initial indexes of first and second sub-arrays
        int k = l;
        while (i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i ++;
            }else{
                arr[k] = R[j];
                j++;
            }k++;
        }
        //copy remaining elements of L[] if any
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        //copy remaining elements of R[] if any
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

//main function of merge sort that sorts arr[ first.....last] using merge() method
    public static void mergeSort(int [] arr, int first, int last) {
        if(first < last){
            //find the middle point
            int middle = (first+last)/2;
            mergeSort(arr, first, middle);
            mergeSort(arr, middle+1, last);
            //merge the sorted halves
            merge(arr, first, middle, last);
        }
    }       

    private static int partition(int[]arr, int low, int high) {
        int pivot = arr[high];
        //index of smaller element
        int i = (low - 1);
        for(int j=low; j<high; j++){
            //if current element is smaller than or equal to pivot
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]  = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void QuickSort(int[]arr, int low, int high) {
        if(low<high){
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,7,4,3,9,2,8,1,6,5};
        selectionSort(arr);
        // System.out.println();
        // bubbleSort(arr);
        System.out.println();
        insertedSort(arr);
    }
}
