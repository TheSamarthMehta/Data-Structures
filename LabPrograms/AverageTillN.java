
import java.util.Scanner;
public class AverageTillN {
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
             int sum = 0;
             for(int i = 1; i <= n; i++){
                 sum +=i;
             }
             System.out.println(sum/n);
        }
    }
}
