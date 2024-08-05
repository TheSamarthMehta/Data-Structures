import java.util.Scanner;

class InsertionSort{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("-----Enter The Size Of The Array-----");
            int size = sc.nextInt();
            System.out.println("-----Enter The Values In Array-----");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("arr["+i+"]=");
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < size; i++){
                int j = i;
                while (j > 0 && arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
            System.out.println("---------After Insertion Sort---------");
            for(int i = 0; i < size; i++){
                System.out.println("arr["+i+"]="+arr[i]);
            }
        }
        
    }
}