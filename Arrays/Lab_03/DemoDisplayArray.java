import java.util.*;
public class DemoDisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of Array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Is: ");
        for (int i=0; i<n; i++) {
            System.out.print(""+ arr[i] +",");
        }
    }
}
