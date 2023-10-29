import java.util.Scanner;

public class JavaStdinAndStdoutTwo {
    public static void main(String[] args) {

        // First, we declare our 'newString':
        String newString = "";

        // Then, we instantiate our Scanner object to read inputs:
        Scanner scanner = new Scanner(System.in);

        // We then read our inputs and separate the different numeric inputs into different variables:
        int newInt = scanner.nextInt();
        double newDouble = scanner.nextDouble();

        // We then loop through our scanner, adding the string inputs into our previously declared 'newString':
        while(scanner.hasNext()) {
            newString += scanner.nextLine();
        }

        // Then, we close our scanner as we no longer need it:
        scanner.close();

        // Finally, we print out our outputs:
        System.out.println("String: " + newString);
        System.out.println("Double: " + newDouble);
        System.out.println("Int: " + newInt);
    }
}

// HackerRank Problem Description:

//In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
//
//        Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
//
//        Input Format
//
//        There are three lines of input:
//
//        The first line contains an integer.
//        The second line contains a double.
//        The third line contains a String.
//        Output Format
//
//        There are three lines of output:
//
//        On the first line, print String: followed by the unaltered String read from stdin.
//        On the second line, print Double: followed by the unaltered double read from stdin.
//        On the third line, print Int: followed by the unaltered integer read from stdin.
//        To make the problem easier, a portion of the code is already provided in the editor.
//
//        Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
//
//        Sample Input
//
//        42
//        3.1415
//        Welcome to HackerRank's Java tutorials!
//        Sample Output
//
//        String: Welcome to HackerRank's Java tutorials!
//        Double: 3.1415
//        Int: 42
