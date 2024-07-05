import java.util.Scanner;
public class DemoDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Size Of The Array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter Element Of Array: ");
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean hasduplicate = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i]==arr[j]) {
                        hasduplicate = true;
                        break;
                    }
                }
                if (hasduplicate) {
                    break;
                }
            }
            if (hasduplicate) {
                System.out.println("Array Contains Duplicate Number");
            }else{
                System.out.println("Array Contains Not Duplicate Number");
            }
        }
    }
}
