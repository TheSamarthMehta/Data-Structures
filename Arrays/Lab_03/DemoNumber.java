import java.util.Scanner;
public class DemoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Largest_Number = arr[0];
        int Smallest_Number = arr[0];
        int Position_Large = 0, Position_Small = 0;
        for (int i = 0; i < n; i++) {
            if (Largest_Number < arr[i]) {
                Largest_Number = arr[i];
                Position_Large = i;
            }else if (Smallest_Number > arr[i]) {
                Smallest_Number = arr[i];
                Position_Small = i;
            }
        }
        System.out.println("Largest Position Is: "+ Position_Large);
        System.out.println("Smallest Position Is: "+ Position_Small);
    }
}
