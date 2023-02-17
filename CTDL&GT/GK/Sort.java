import java.util.Scanner;
public class Sort {
    public static void bubbleSort(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] a){
        for(int i=a.length-1;i>=1;i--){
            int index=i;
            for(int j=0;j<i;j++){
                if(a[j]>a[index]){
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
    }
    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            int next=a[i];
            int j;
            for(j=i-1;j>=0 && a[j]>next;j--){
                a[j+1]=a[j];
            }
            a[j+1]=next;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n=");
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number "+(i+1));
            a[i]=sc.nextInt();
        }
        sc.close();
        // bubbleSort(a);
        selectionSort(a);
        // insertionSort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
