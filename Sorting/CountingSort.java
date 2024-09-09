
import java.util.Scanner;

class Counting_Sort {
    int[] arr;

    public Counting_Sort(int[] arr) {
        this.arr = arr;
    }

    int [] sort(){
       int k=arr[0];
       //To find the max Element from the array A
       for(int i=1;i<arr.length;i++){
         if(arr[i]>k){
            k=arr[i];
         }
       }

       //Create and initialize the array c with 0
       int [] c = new int[k];
       for(int i=0;i<k;i++){
          c[i]=0;
       }
       
       //update c with occurences of each element
       for(int i=0;i<arr.length;i++){
          int temp=arr[i];
          c[temp-1]=c[temp-1]+1;
       }

       // in c add the value of previous element from idx 2
       for(int i=1;i<k;i++){
          c[i]=c[i-1]+c[i];
       }
       
       int [] b = new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
          int temp=arr[i]-1;
          b[c[temp]-1]=arr[i];
          c[temp]--;
       }

       return b;
    }
}

public class CountingSort {
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

            Counting_Sort cs = new Counting_Sort(arr);
            int [] newArr = cs.sort();

            // Print the Sorted Array
            for (int i = 0; i < newArr.length; i++) {
                System.out.print("arr[" + i + "]=" + newArr[i] + " ");
            }
        }
        System.out.println();
    }
}
