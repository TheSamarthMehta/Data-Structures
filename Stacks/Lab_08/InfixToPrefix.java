import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String infixToPrefix(String infix) {
        String reversedInfix = reverse(infix);
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char current = reversedInfix.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                prefix.append(current);
            } 

            else if (current == ')') {
                stack.push(current);
            } 

            else if (current == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); 
            } 
            else if (isOperator(current)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(current)) {
                    prefix.append(stack.pop());
                }
                stack.push(current);
            }
        }


        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return reverse(prefix.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Infix String: ");
        String infixExpression = sc.nextLine();
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}