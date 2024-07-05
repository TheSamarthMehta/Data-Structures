import java.util.Scanner;
public class DemoMatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the Row For Matrix1: ");
        int row = sc.nextInt();
        System.out.println("--Enter the Column For Matrix1: ");
        int col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        System.out.println("--Enter Element Of Matrix1--");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("--Enter The Row For Matrix2: ");
        int rows = sc.nextInt();
        System.out.println("--Enter The Column For Matrix2: ");
        int cols = sc.nextInt();
        int matrix2[][] = new int[rows][cols];
        System.out.println("--Enter Element Of Matrix2--");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if (col != rows) {
              System.out.println("Error: The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] resultMatrix = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < col; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resulting Matrix:");
        for (int[] row1 : resultMatrix) {
            for (int element : row1) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
