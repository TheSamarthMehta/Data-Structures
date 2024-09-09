import java.util.Scanner;
class MergeSortDemo{
    int [] arr;
    
    //Constructor to copy arr
    MergeSortDemo(int arr[]){
        this.arr = arr;
    }
    
    //Function to create partition of an array
    void mergeSort( int low , int high){
        int mid;
        if(low>=high){
            return;
        }
        else{
            mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            System.out.println("low=" + low + "high=" + high + "md=" + mid);
            merge(low, mid, high);
        }
    }

    //Function to sort the parts of an array
    void merge(int low,int mid,int high){
        int [] b = new int[high-low+1];
        int h,i,j;
        h=low;
        j=mid+1;
        i=0;
        while(h<=mid && j<=high){
            if(arr[h]<=arr[j]){
                b[i++]=arr[h++];
            }else{
                b[i++]=arr[j++];
            }
        }
        if(h>mid){
            for(int k=j;k<=high;k++){
                b[i++]=arr[k];
            }
        }else{
            for(int k=h;k<=mid;k++){
                b[i++]=arr[k];
            }
        }
        i=0;
        for(int k=low;k<=high;k++){
            arr[k]=b[i++];
        }
    }
}
public class MergeSort {
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

            MergeSortDemo ms = new MergeSortDemo(arr);
            ms.mergeSort(0,n-1);
            
            //Print the Sorted Array
            for(int i=0;i<arr.length;i++){
                System.out.print("arr["+i+"]="+arr[i]+" ");
            }
        }
        System.out.println();
    }
}