import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {
            System.out.print("Enter the string: ");
            String input = sc.nextLine();

            if (isBalanced(input)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

        sc.close();
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}