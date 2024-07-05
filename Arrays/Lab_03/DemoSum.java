import java.util.Scanner;
public class DemoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int i = n; i <= m; i++) {
            ans += i;
        }
        System.out.println("Sum Of Terms Is: "+ ans);
    }
}
