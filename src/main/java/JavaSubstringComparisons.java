import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {

        //First, we instantiate our scanner to read our input:
        Scanner scanner = new Scanner(System.in);

        // Next, we'll set some initial values to prepare our algorithm. Important things to note here is k, which is what determines our substring length, as well as our smallest and largest substrings here, which are our solutions:
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String currentSubstring = s.substring(0, k);
        String smallestString = currentSubstring;
        String largestString = currentSubstring;

        // Now let's loop through our input 's' and set our smallest or largest depending on the lex values we get, denoted by positive or negative ints:
        for(int i = 1; i <= s.length() - k; i++) {
            currentSubstring = s.substring(i, i + k);
            if(currentSubstring.compareTo(largestString) > 0) {
                largestString = currentSubstring;
            } else if(currentSubstring.compareTo(smallestString) < 0) {
                smallestString = currentSubstring;
            }
        }

        // Finally, we'll close our scanner and present our solution:
        scanner.close();
        System.out.println(smallestString + "\n" + largestString);
    }
}
