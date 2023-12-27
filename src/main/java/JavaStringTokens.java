import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    // We're going to go through each method. There are probably better ways to go about this problem, but this solution worked for me and seems reasonably efficient:

    // First, we're going to split our input:
    public static String[] getTokens(String input) {
        return input.split("[^a-zA-Z]");
    }

    // We're going to take that split input and get a proper count out of it:
    public static int getTokenCount(String[]tokens) {
        int count = 0;
        for (int i = 0; i < Arrays.stream(tokens).count(); i++) {
            if(!tokens[i].equals("")) {
                count++;
            }
        }
        return count;
    }

    // This is how we format our output after our count:
    public static void displayTokens(String[]tokens) {
        for(int i = 0; i < Arrays.stream(tokens).count(); i++) {
            if(!tokens[i].equals("")) {
                System.out.println(tokens[i].replace(",", ""));
            }
        }
    }

    // Here we'll open our scanner, get our correct output by running our methods with the scanned input, then close our scanner and done:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[]s = getTokens(input);
        System.out.println(getTokenCount(s));
        displayTokens(s);
        scanner.close();
    }
}
