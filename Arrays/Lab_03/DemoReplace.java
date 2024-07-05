import java.util.Scanner;
public class DemoReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the first number to replace:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number to replace with:");
        int num2 = sc.nextInt();
        int replacedIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1) {
                arr[i] = num2;
                replacedIndex = i;
                break;
            }
        }
        if (replacedIndex != -1) {
            System.out.println("The first occurrence of " + num1 + " was replaced with " + num2 + " at index " + replacedIndex + ".");
        } else {
            System.out.println("The first number was not found in the array.");
        }
    }
}