import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {

    public static boolean checkCompile(String s) {
        try {
            Pattern.compile(s);
        } catch (PatternSyntaxException e) {
            e.getStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        if(scanner.next().equals("[ ]*")) {
            System.out.println("Valid");
        }
        for(int i = 0; i < inputCount; i++) {
            if(checkCompile(scanner.next())) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
