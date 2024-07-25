import java.util.Scanner;
import java.util.Stack;

public class ValidCondition {
    
  
    public static int isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
           
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return 0; 
                }
            }
        }
        
       
        return stack.isEmpty() ? 1 : 0;
    }
    

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter No of Test Cases: ");
        int T = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input));
        }
        
        scanner.close();
    }
}