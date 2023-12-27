import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static String[] getTokens(String input) {
        return input.split("[' ?!.]");
    }

    public static long getTokenCount(String[]tokens) {
        return Arrays.stream(tokens).count();
    }

    public static void displayTokens(String[]tokens) {
        for(int i = 0; i < Arrays.stream(tokens).count(); i++) {
            System.out.println(tokens[i].replace(",", "").trim());
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
