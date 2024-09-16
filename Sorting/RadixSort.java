import java.util.Scanner;

class Radix_Sort {
    int[] arr;

    public Radix_Sort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        int max = arr[0];
        // To find the max Element from the array A
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // count total no. of digits in max
        int count = 0;
        while (max != 0) {
            max = max / 10;
            count++;
        }
        System.out.println("c=" + count);
        int track=1;
        while(track<=count){
            int [] digits = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                int n=arr[i];
                int flag=track;
                while(flag>1 && n!=0){
                   n=n/10;
                   flag--;
                }
                digits[i] = n%10;
            }

            int [] newArr = Countingsort(digits);
            for(int i=0;i<arr.length;i++){
                arr[i] = newArr[i];
            }
            track++;
        }
        return;
    }

    int[] Countingsort(int[] newArr) {
        int k = newArr[0];
        // To find the max Element from the array A
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] > k) {
                k = newArr[i];
            }
        }

        // Create and initialize the array c with 0
        int[] c = new int[k + 1];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }

        // update c with occurences of each element
        for (int i = 0; i < newArr.length; i++) {
            int temp = newArr[i];
            c[temp] = c[temp] + 1;
        }

        // in c add the value of previous element from idx 2
        for (int i = 1; i <= k; i++) {
            c[i] = c[i - 1] + c[i];
        }

        int[] b = new int[newArr.length];
        System.out.println(newArr.length);
        for (int i = newArr.length - 1; i >= 0; i--) {
            int temp = newArr[i];
            b[--c[temp]] = arr[i];
        }

        return b;
    }
}

public class RadixSort {
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

            Radix_Sort rs = new Radix_Sort(arr);
            // int[] newArr = 
            rs.sort();

            // Print the Sorted Array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("arr[" + i + "]=" + arr[i] + " ");
            }
        }
        System.out.println();
    }
}