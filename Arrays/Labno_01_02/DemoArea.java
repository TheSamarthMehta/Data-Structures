import java.util.Scanner;
class DemoArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double Area = 3.14 * radius * radius;
        System.out.println("Area Of Circle Is : " + Area);
    }
}