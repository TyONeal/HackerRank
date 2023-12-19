import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        // First, we instantiate our scanner and take in our input. We're using StringBuilder to build the reverse of our input, so we instantiate it here as well:
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input).reverse();

        // Now, we set up a simple conditional to determine whether our input is a palindrome:
        if(builder.toString().equals(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Finally, we close our scanner:
        scanner.close();
    }
}
