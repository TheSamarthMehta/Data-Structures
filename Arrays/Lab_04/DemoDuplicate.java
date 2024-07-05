import java.util.Scanner;
public class DemoDuplicate {
    public static int[] insertX(int n, int arr[], int x, int pos) {
        int i;
        int[] newarr = new int[n+1];
        System.out.println("Enter The Element For The Array");
        for(i = 0; i < n+1; i++){
            if (i < pos -1 ) {
                newarr[i] = arr[i];
            }else if (i == pos -1) {
                newarr[i] = x;
            }else{
                newarr[i] = arr[i-1];
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println("Enter The Element Of Array: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array Is: ");
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter The Element To Insert:");
        int x = sc.nextInt();
        System.out.println("Enter Position Where You Want To Insert: ");
        int pos = sc.nextInt();
        arr = insertX(n, arr, x, pos);
    }
    }


