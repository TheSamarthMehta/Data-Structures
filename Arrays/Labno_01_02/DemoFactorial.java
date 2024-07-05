import java.util.Scanner;
public class DemoFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int Factorial = 1;
        while (i <= num) {
            Factorial*=i;
            i++;
        }
        System.out.println("The Factorial Of Given Number " + num + " Is: " + Factorial);
    }
}
