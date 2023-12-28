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

    }
}
