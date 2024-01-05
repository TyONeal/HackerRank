import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

    // First, we establish our regex by creating our custom string:
    private static final String ipRegex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";

    // Next, we instantiate our pattern to compile our regex for comparison:
    private static final Pattern pattern = Pattern.compile(ipRegex);

    // Here we check our string input against our previously created pattern:
    private static void checkRegex(String s) {
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // Finally, we run our main method to get our appropriate output:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            checkRegex(scanner.nextLine());

        }
    }
}
