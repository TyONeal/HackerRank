import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static String[] getTokens(String input) {
        return input.split("['\\]\\[\\s@?!\".]");
    }

    public static int getTokenCount(String[]tokens) {
        int count = 0;
        for (int i = 0; i < Arrays.stream(tokens).count(); i++) {
            if(!tokens[i].equals("")) {
                count++;
            }
        }
        return count;
    }

    public static void displayTokens(String[]tokens) {
        for(int i = 0; i < Arrays.stream(tokens).count(); i++) {
            if(!tokens[i].equals("")) {
                System.out.println(tokens[i].replace(",", ""));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[]s = getTokens(input);
        System.out.println(getTokenCount(s));
        displayTokens(s);
    }
}
