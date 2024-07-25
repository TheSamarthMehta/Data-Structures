import java.util.Scanner;

public class ValidationString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isRecognized(input)) {
            System.out.println("The string is recognized.");
        } else {
            System.out.println("The string is not recognized.");
        }

        scanner.close();
    }

    public static boolean isRecognized(String input) {
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a') {
                aCount++;
            } else if (c == 'b') {
                bCount++;
            } else {
                return false;
            }
        }

        return aCount == bCount && aCount >= 1;
    }
}