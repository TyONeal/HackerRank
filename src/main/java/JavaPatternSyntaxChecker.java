import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {

    // Here, we'll only need two methods to get our answer. Our first method will attempt a try-catch, and print out our appropriate output:
    public static void checkCompile(String s) {
        try {
            Pattern.compile(s);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }

    // Our main method will use our checkCompile method to loop through our lines of input. It's very important to move to the next line after getting our first int. Make sure you close your scanner at the end:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < inputCount; i++) {
            checkCompile(scanner.nextLine());
        }
        scanner.close();
    }
}
