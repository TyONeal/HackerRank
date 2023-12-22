import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagrams {

    // Because this problem required a few different methods, I'm going to explain what each method is doing instead of going line by line:

    // charFrequency takes in a String as well as a specific char to check that char's frequency. We loop through to get our proper integer:
    public static int charFrequency(String input, char letter) {
        int frequency = 0;
        String newInput = input.toLowerCase();
        char newLetter = Character.toLowerCase(letter);

        for(int i = 0; i < input.length(); i++) {
            if(newInput.charAt(i) == newLetter) {
                frequency++;
            }
        }
        return frequency;
    }

    // We then use our previous method to map out our HashMap according to the values we get for frequency from each char:
    public static HashMap<Character, Integer> frequencyMapper(String a) {
        HashMap<Character, Integer> hash = new HashMap<>();
        String newA = a.toLowerCase();

        for(int i = 0; i < a.length(); i++) {
            hash.put(newA.charAt(i), charFrequency(newA, newA.charAt(i)));
        }
        return hash;
    }

    // We then check to see if the two different HashMaps from our inputs are equal. If they are, we provide the proper output:
    public static String isSameFrequency(HashMap<Character, Integer> a, HashMap<Character, Integer> b) {
        if(a.equals(b)) {
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }
    }

    // Finally we run our main method to get our proper output based on what we've built. We make sure to close our scanner at the end:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        scanner.close();
        System.out.println(isSameFrequency(frequencyMapper(firstInput), frequencyMapper(secondInput)));
    }
}
