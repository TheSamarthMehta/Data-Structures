import java.util.Scanner;
class Swap{
    int temp = 0;
    int a, b;
    public void setnumber(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>0) {
            temp = b;
            b = a;
            a = temp;
        }
    }
    public void displaynumber(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class DemoSwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Swap s1 = new Swap();
        s1.setnumber();
        s1.displaynumber();

    }
}
