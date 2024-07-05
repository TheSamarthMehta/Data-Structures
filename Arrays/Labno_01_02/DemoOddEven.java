import java.util.*;
public class DemoOddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The Entered Number Is Even : " + num);
            }else{
                System.out.println("The Entered Number Is Odd :" + num);
            }
        }
    }
}
