
import java.util.Scanner;
public class VowelsConsonents{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the char:");
            char a = sc.next().charAt(0);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                System.out.println("Vovel");
            }else{
                System.out.println("Consonent");
            }
        }
    }
}
