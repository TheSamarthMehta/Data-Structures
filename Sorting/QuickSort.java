import java.util.Scanner;

class Quick_Sort {
    // initializing the array
    int[] arr;

    // insrting values in the array
    public Quick_Sort(int[] arr) {
        this.arr = arr;
    }

    void sort(int lb, int ub) {
        boolean flag=true;
        int i = lb;
        int j = ub + 1;
        int key = arr[lb];
        if(lb<ub){
            while(flag){
                i++;
                while(arr[i]<key){
                    i++;
                }
                j--;
                while(arr[j]>key){
                    j--;
                }
                if(i<j){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }else{
                    flag=false;
                }
            }

            int swap=arr[lb];
            arr[lb]=arr[j];
            arr[j]=swap;
        }else{
            return;
        }
        sort(lb, j - 1);
        sort(j + 1, ub);
    }


}

public class QuickSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter the size of an array to be sorted:");
            int n = sc.nextInt();

            System.out.println("Enter the array values:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("arr[" + i + "]=");
                arr[i] = sc.nextInt();
            }

            Quick_Sort qs = new Quick_Sort(arr);
            qs.sort(0, n - 1);

            // Print the Sorted Array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("arr[" + i + "]=" + arr[i] + " ");
            }
        }
        System.out.println();
    }
}