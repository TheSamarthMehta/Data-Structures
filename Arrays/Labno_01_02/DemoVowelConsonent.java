import java.util.Scanner;
public class DemoVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
            if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
                System.out.println("The Character Is Vowels: " + ch);
            }else{
                System.out.println("The Character Is Consonants: " + ch);
            }
        }
}
