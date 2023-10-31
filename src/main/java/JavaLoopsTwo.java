import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsTwo {
    public static void main(String[] args) throws IOException {

        // First, we instantiate our Scanner Object, as we plan on doing some parsing.
        Scanner scanner = new Scanner(System.in);

        // Next, we need to create a function that will check to see how many lines of input there are, and set them into their own arrays:
        ArrayList<Integer> inputs = new ArrayList<>();

        while(scanner.hasNext()) {
            String inputLine = scanner.nextLine();
            if(inputLine == null || inputLine.isEmpty()) {
                break;
            } else {

            }
        }



        // Next, we read through our three lines of inputs, and place them into a string each:
        String firstLine = buffReader.readLine().trim();
        String secondLine = buffReader.readLine().trim();
        String thirdLine = buffReader.readLine().trim();

        // I also decide to parse the first line. Unsure if I will need/use this, yet:
        int initial = Integer.parseInt(firstLine);

        // The second and third lines are a bit more complex. They contain three sets of numbers each. We need to split the string first, so we do so here, creating separate arrays:
        String[] secondInput = secondLine.split(" ");
        String[] thirdInput = thirdLine.split(" ");

        // Now, each string array (second and third input) are ready to be used. We know they have a length of [2], so we set our initial ints to these lengths to provide me with what I need to solve the problem:
        int a = Integer.parseInt(secondInput[0]);
        int b = Integer.parseInt(secondInput[1]);
        int n = Integer.parseInt(secondInput[2]);

        // Here is where things get tricky. According to the problem, we are Math.pow the first input, our 'initial.' It was tempting to use Math.pow(b, 0) here, because in the first loop it would work (b = 2), but I ran into issues with the second loop because there b = 3, and the numbers were off slightly. This has been resolved.
        int firstIteration = (int) (a + (Math.pow(initial, 0) * b));
        solution[0] = firstIteration;

        // Update: Found the correct solution for the first values in this loop. We specify the iterator in our solution's index, as well as our Math.pow in order to get our correct values. The concat works as expected!
        for(int i = 0; i < n; i++) {
            solution[i + 1] = firstIteration += (Math.pow(initial, i + 1) * b);
        }

        // Once our first set of iterations are done from our first loop, it's time to set our values to the third row of our input, and do it all again:
        a = Integer.parseInt(thirdInput[0]);
        b = Integer.parseInt(thirdInput[1]);
        n = Integer.parseInt(thirdInput[2]);

        // Same as above. We know that 'n' equaled 10 in the first loop, so 'i < n' comes out to i = 9 at the end of the loop. Here we set the 10 index of solution to continue.
        int secondIteration = (int) (a + (Math.pow(initial, 0) * b));
        solution[10] = secondIteration;

        // This was the trickiest part of the problem. I need to solve the rest of 'solution' (iterations 11 - 14). In this problem, 'n' = 5. I only need 4 iterations to get my solution finished, so we make sure to state that: (i < n - 1) in order to get our correct iterations through the loop. We set the solution[i] similar to what we did in the first loop. Notice that I used the variable 'initial' in all my Math.pow. While it may had been tempting to hardcode the 2 in to get the correct values for this specific test case, to account for all cases I need to a variable instead. Slightly less readable, but much more correct.
        for(int i = 0; i < n - 1; i++) {
            solution[i + 11] = secondIteration += (Math.pow(initial, i + 1) * b);
        }

        // Finally, we will iterate through the entire solution array to sout out our correct and final solution. We need to make sure the formatting is correct, in this case the first 10 numbers on the first line, the last five on the second line. This requires additional loops. First, we parse our second and third input's [2] index to an int to get our appropriate lengths:
        int secondLength = Integer.parseInt(secondInput[2]);
        int thirdLength = Integer.parseInt(thirdInput[2]);

        // Then, we do our first loop to get our first line of output:
        for(int i = 0; i < secondLength; i++) {
            System.out.print(solution[i] + " ");
        }

        // After our first loop, we use formatter to get to our next line of output:
        System.out.printf("%n");

        // Finally, we complete our second loop to get our final solution!
        for (int i = 0; i < thirdLength; i++) {
            System.out.print(solution[i + 10] + " ");
        }
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
