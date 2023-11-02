import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {

        // First, let's instantiate a Scanner Object to read through our inputs:
        Scanner scanner = new Scanner(System.in);

        // Now, create an int we can increment to get our correct number in our format:
        int t = 0;

        // Finally, we create our while loop, which will occur until the scanner no longer has a next line. We format our output according to the problem's requirements:
        while (scanner.hasNext()) {
            System.out.printf("%s %s", t += 1, scanner.nextLine());
            System.out.println();
        }
    }
}

// HackerRank Problem Description:

//"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)
//
//        The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
//
//        Hint: Java's Scanner.hasNext() method is helpful for this problem.
//
//        Input Format
//
//        Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
//
//        Output Format
//
//        For each line, print the line number, followed by a single space, and then the line content received as input.
//
//        Sample Input
//
//        Hello world
//        I am a file
//        Read me until end-of-file.
//        Sample Output
//
//        1 Hello world
//        2 I am a file
//        3 Read me until end-of-file.