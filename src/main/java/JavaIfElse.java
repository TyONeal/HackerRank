import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        // First, we instantiate our BufferedReader Object with a new Input Stream Reader to read through a user's input:
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Then, we parse our input to get a proper int we can use:
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Then, we close our reader, as we no longer need it:
        bufferedReader.close();

        // We then loop through our input to determine what we are actually printing out:

        // Our initial 'if' statement will check for numbers between 1 and 100:
        if (N >= 1 && N <= 100){

            // Inside the initial 'if', we have our first if statement. It checks if 'N' is either 2 or 4 and prints out 'Not Weird':
            if ((N <= 5) && (N % 2 == 0)) {
                System.out.println("Not Weird");

            // Our first else-if checks if N is still even, but is greater than 20. If it is, we print out 'Not Weird':
            } else if (N > 20 && N % 2 == 0) {
                System.out.println("Not Weird");

            //Our second else-if checks if N is still even, and is between 6 and 20 (in between our first 'Not Weirds'). If it is, we print out 'Weird':
            } else if ((N >= 6 && N <= 20) && (N % 2 == 0)) {
                System.out.println("Weird");

            // Our final else within the initial 'if-else' checks for everything else, in this case all odd numbers and returns 'Weird':
            }else {
                System.out.println("Weird");
            }

        //If our number is not between 1 and 100, we simply print out 'Weird':
        } else {
            System.out.println("Weird");
        }
    }
}

// HackerRank Problem Description:

//Task
//        Given an integer, , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
//
//        Input Format
//
//        A single line containing a positive integer, .
//
//        Constraints
//
//        Output Format
//
//        Print Weird if the number is weird; otherwise, print Not Weird.
//
//        Sample Input 0
//
//        3
//        Sample Output 0
//
//        Weird
//        Sample Input 1
//
//        24
//        Sample Output 1
//
//        Not Weird
//        Explanation
//
//        Sample Case 0:
//        is odd and odd numbers are weird, so we print Weird.
//
//        Sample Case 1:
//        and  is even, so it isn't weird. Thus, we print Not Weird.
