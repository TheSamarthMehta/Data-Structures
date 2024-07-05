import java.util.*;
public class DemoPower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("---Please Enter The Value For Base---");
            double base = sc.nextInt();
            System.out.println("---Please Enter The Value For Power---");
            double power = sc.nextInt();
            double result = Math.pow(base, power);
            System.out.println("Power Of Given Base " + base + " Is " + result);
        }
    }
}
