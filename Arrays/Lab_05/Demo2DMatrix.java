import java.util.Scanner;
public class Demo2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the Rows: ");
        int row = sc.nextInt();
        System.out.println("--Enter the Columns: ");
        int column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        System.out.println("--Enter The Element Of 2D--");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[row][column];
        System.out.println("--Enter The Element Of 2D--");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int arr3[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println("-----Addition-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
