import java.util.Scanner;

public class DemoPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The Number Is Prime: "+num);
            }else{
                System.out.println("The Number Is Not a Prime: "+num);
            }
    }
}
