import java.util.*;
import java.util.Stack;
 
class PostfixEvalutor{
    Stack<Integer> stack = new Stack<>();
    public int eval(String postfixexpression){
        String[] arr = (postfixexpression.split(","));
        for(int i = 0; i < arr.length; i++){
            char[] c = arr[i].toCharArray();

            if (Character.isDigit(c[i])) {
                stack.push(c[i] - '0');
            }else{
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c[i]) {
                    case '+':
                        stack.push(operand1+operand2);
                        break;

                    case '-':
                    stack.push(operand1-operand2);
                        break;

                    case '*':
                    stack.push(operand1*operand2);
                        break;

                    case '/':
                    stack.push(operand1/operand2);
                        break;

                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }
}
public class EvalPostfix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostfixEvalutor pe = new PostfixEvalutor();
        String postfixexpression = sc.nextLine();
        int result = pe.eval(postfixexpression);
        System.out.println("Postfix Expression: "+ postfixexpression);
        System.out.println("Result: "+ result);
    }
}