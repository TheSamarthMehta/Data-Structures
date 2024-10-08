
import java.util.*;
class MyStack {
    int top = -1;
    int n;
    char[] arr;
    MyStack(int n) {
        this.n = n;
        arr = new char[n];
    }
    void push(char x) {
        if (top >= (n-1)) {
            System.out.println("MyStack Overflow");
        } else {
            top = top + 1;
            arr[top] = x;
            System.out.println("Element is pushed successfully");
        }
        return;
    }
    char pop() {
        
            top = top - 1;
            return arr[top+1];
        
    }
    int size(){
        return top + 1;
    }
}
public class ReverseWhenVowelIsFound {
	public static void main (String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of T:");
            
                System.out.println("Enter the length of String:");
                int N=sc.nextInt();
                System.out.println("Enter the String:");
                String s=sc.next();
                
                MyStack st = new MyStack(N);
                for(int i=N-1;i>=0;i--){
                    st.push(s.charAt(i));
                }
                
                StringBuffer sb = new StringBuffer("");
                
                while(st.size()!=0){
                    char r=st.pop();
                    if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                        sb.reverse();
                        sb.append(r);
                    }else{
                        sb.append(r);
                    }
                }
                System.out.println("The String is:"+sb.toString());
        }
	}
}