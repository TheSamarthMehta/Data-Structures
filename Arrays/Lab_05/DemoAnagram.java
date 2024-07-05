import java.util.Scanner;
public class DemoAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--User Array Ni Size Aapo--");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("---User Words Aapo---");
        String word = sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        int a = (int)(Math.random() * (n-1));
        String b = arr[a];
        String c = sc.nextLine();
        if (b.length() != c.length()) {
            System.out.println("This Is Not Anagram");
        }else{
            for (int i = 0; i < b.length(); i++) {
                d[i] = sc.charAt(i);
            }
        }
    }
}
