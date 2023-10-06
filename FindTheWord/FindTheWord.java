package FindTheWord;
import java.util.Scanner;

public class FindTheWord {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            String result = findNthWord(input, n);

            if (result != null) {
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid input or n is out of range.");
            }
        }

        public static String findNthWord(String input, int n) {
            if (input == null || input.isEmpty()) {
                return null;
            }

            String[] words = input.split("\\s+");

            if (n >= 1 && n <= words.length) {
                return words[n - 1];
            } else {
                return null;
            }
        }
    }

} 
