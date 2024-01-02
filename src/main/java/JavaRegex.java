import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

    private static final String ipRegex = "^((25[0-5]|(2[0-4]|1\\\\d|[1-9]|)\\\\d)\\\\.?\\\\b){4}$";

    private static final Pattern pattern = Pattern.compile(ipRegex);

    private static void checkRegex(String s) {
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            checkRegex(scanner.nextLine());
        }
    }
}
