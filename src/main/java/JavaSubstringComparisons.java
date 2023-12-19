import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String solution = "";

        List<String> ourSubstrings = new ArrayList<>();

        for ( int i = 0; i < s.length() - (k - 1); i ++ ) {
            String parsedString = s.substring(i , i + k);
            ourSubstrings.add( parsedString );
        }

        System.out.println("substrings --->" + ourSubstrings);

        for(int i = 0; i < ourSubstrings.size() - 1; i++) {
            int compareValue = ourSubstrings.get(i).compareTo(ourSubstrings.get(i + 1));
            if(compareValue < 0) {
                solution = ourSubstrings.get(i);
            }
        }

        System.out.println(solution);

    }
}
