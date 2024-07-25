import java.util.Scanner;
import java.util.Stack;

public class StringRecognition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isRecognized(input)) {
            System.out.println("The string is recognized.");
        } else {
            System.out.println("The string is not recognized.");
        }

        sc.close();
    }

    public static boolean isRecognized(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'b') {
                stack.push(c);
            } else if (c == 'c') {
                if (stack.isEmpty() || stack.pop() != 'b') {
                    return false;
                }
                if (stack.isEmpty() || stack.pop() != 'a') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}