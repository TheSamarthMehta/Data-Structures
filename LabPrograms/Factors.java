
import java.util.Scanner;
public class Factors{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
        
    }
}
