import java.util.Scanner;
public class DemoInsertAtLocation {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Size Of Array: ");
            int size = sc.nextInt();
            int arr1[] = new int[size];
            
            System.out.println("Enter The Element Of Array: ");
            for(int i=0 ; i<size ; i++){
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter The Index To Insert: ");
            int Index = sc.nextInt();

            System.out.println();
            int number = sc.nextInt();
            int arr2[] = new int[size+1];
    
            for(int i=0;i<(size+1);i++){
                if(i==Index){
                    arr2[i]=number;
                }
                else if(i<Index){
                    arr2[i]=arr1[i];
                }
                else if(i>Index){
                    arr2[i]=arr1[i-1];
                }
            }
            for(int i=0;i<(size+1);i++){
                System.out.print(arr2[i]+" ");
        }
    }   
}
