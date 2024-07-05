import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans += i;
        }
        ans = (ans/n);
        System.out.println(ans);
    }
}
