import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int k = scanner.nextInt();

        List<String> ourSubstrings = new ArrayList<>();

        for (int i = 0; i < s.length() - k; i += k) {
            String parsedString = s.substring(i , i + k);
            ourSubstrings.add(parsedString);
        }
        System.out.println(ourSubstrings);
    }
}
