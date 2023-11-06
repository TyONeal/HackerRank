import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        // First we instantiate our Scanner Object to take in our input:
        Scanner scanner = new Scanner(System.in);

        // Then, we take the two lines of input and place them into their own String variables:
        String a = scanner.next();
        String b = scanner.next();

        // Our first output is simply the length's added together (sum):
        System.out.println(a.length() + b.length());

        // Our second output is based on alphabetical order, and prints yes or no depending on the conditional:
        int isAlphabetical = a.compareTo(b);
        if (isAlphabetical < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Our last line of input is simply the two lines put together with a space. First, we must capitalize the first letter of each word:
        String first = a.substring(0, 1).toUpperCase() + a.substring(1);
        String second = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(first + " " + second);
    }
}

// HackerRank Problem Description

//"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)
//
//        This exercise is to test your understanding of Java Strings. A sample String declaration:
//
//        String myString = "Hello World!"
//        The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//        Given two strings of lowercase English letters,  and , perform the following operations:
//
//        Sum the lengths of  and .
//        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//        Capitalize the first letter in  and  and print them on a single line, separated by a space.
//        Input Format
//
//        The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//        Output Format
//
//        There are three lines of output:
//        For the first line, sum the lengths of  and .
//        For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//        For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
//
//        Sample Input 0
//
//        hello
//        java
//        Sample Output 0
//
//        9
//        No
//        Hello Java
//        Explanation 0
//
//        String  is "hello" and  is "java".
//
//        has a length of , and  has a length of ; the sum of their lengths is .
//        When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
//
//        When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
