import java.util.Scanner;
public class DemoTerm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int sum = 0;
             if (num1 >= 1) {
                sum = (num1*(num1+1))/2;
             }
             System.out.println(sum);
        }
    }
}
