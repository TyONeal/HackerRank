import java.io.IOException;
import java.util.Scanner;

public class JavaLoopsTwo {
    public static void main(String[] args) throws IOException {
        // First, let's instantiate our scanner object:
        Scanner scan = new Scanner(System.in);

        // Next, we scan the first int, as that tells us our amount of queries. We'll set this variable to 'q', as that makes the most sense:
        int q = scan.nextInt();

        // Now we'll build our loop. We'll set the length to the amount of queries we plan on iterating through:
        for (int i = 0; i < q; i++) {

            // Now that we're inside the loop, let's go on ahead and set our variables to the scanner's next ints, in the correct order. Scanner is nice here, because it will automatically go to the next line without us having to explicitly say it needs to:
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            // Now we create our nested loop. We'll call this one 'j', as it comes after 'i', and we've already used 'i' above:
            for (int j = 0; j < n; j++) {
                // Inside our second loop, we run our 'equation' that gets us our correct values. 2 is hardcoded here due to the problem's parameters given:
                a += b * (int) Math.pow(2, j);

                // Now we 'sout' out our output:
                System.out.print(a + " ");
            }
            // Outside the loop, we move our output to the next line so that things are kept formatted correctly:
            System.out.println();
        }
        // Once every query has been processed and finished, we simply close our scanner, as we're not using it any longer.
        scan.close();
    }
}

// HackerRank Problem Description:

//    We use the integers , , and  to create the following series:
//
//        You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
//
//        Input Format
//
//        The first line contains an integer, , denoting the number of queries.
//        Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
//
//        Constraints
//
//        Output Format
//
//        For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
//
//        Sample Input
//
//        2
//        0 2 10
//        5 3 5
//        Sample Output
//
//        2 6 14 30 62 126 254 510 1022 2046
//        8 14 26 50 98
//        Explanation
//
//        We have two queries:
//
//        We use , , and  to produce some series :
//
//        ... and so on.
//
//        Once we hit , we print the first ten terms as a single line of space-separated integers.
//
//        We use , , and  to produce some series :
//
//        We then print each element of our series as a single line of space-separated values.
