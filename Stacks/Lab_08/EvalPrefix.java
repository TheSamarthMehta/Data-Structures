import java.util.Scanner;
import java.util.Stack;;
class EvalutePrefix{
    Stack<Integer> stack = new Stack<>();
    public int Evalutor(String sb){
        String[] arr = sb.split(",");

        for(int i = 0 ; i < arr.length ; i++){
            String temp = arr[i];
            
        }
        return stack.pop();

    }
}
public class EvalPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String newstring = sc.nextLine();
        sb.append(newstring);
        sb.reverse();
        System.out.println(sb);
    }
}
