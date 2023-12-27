import java.util.Arrays;

public class JavaStringTokens {

    public static void getTokens(String s) {
        // Create custom regex for solving problem
        String[]tokens = s.split(" (?=[A-Za-z]{2}:)");
        // Run split to get proper info.
        System.out.println(Arrays.toString(tokens));

    }

    public static void main(String[] args) {
        getTokens("Hey the're how are you");
    }
}
