import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsTwo {
    public static void main(String[] args) throws IOException {

        // First, we instantiate our BufferedReader Object, with an InputStreamReader to read our inputs:
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        // Then, we create a new int array that can hold 15 separate values, as that is what is required to solve the problem:
        int[] solution = new int[15];

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

        // Here is where things get tricky. I need to be able to add a static value to the solution (int[] solution) without this value changing. I've had multiple issues getting this done, mainly because the value will change based on the way I'm setting up my concat. I attempt to cast the first value [0] of solution into an int. I hardcode my values, because I know that b goes to the 0 power first. This 'firstIteration' technically comes out simplified as (a + (1 * b)), or simply (a + b), but I elected to keep it un-simplified, so I can keep track of what I'm doing.
        int firstIteration = (int) (a + (Math.pow(b, 0) * b));
        solution[0] = firstIteration;

        // We've set 'n' to our correct iterations, for our loop. Now we loop through and set the index of solution (with a plus one to avoid our [0] first iteration) with the correct concat. The obvious problem here is that this is not going to give me my correct numbers. At this point, I'm only 'concating' each solution, never using my initial 'firstIteration' to get the correct values. This will need work to verify I'm getting the correct solutions. Souting will have to come next.
        for(int i = 0; i < n; i++) {
            solution[i + 1] += (Math.pow(b, i) * b);
        }

        // Once our first set of iterations are done from our first loop, it's time to set our values to the third row of our input, and do it all again:
        a = Integer.parseInt(thirdInput[0]);
        b = Integer.parseInt(thirdInput[1]);
        n = Integer.parseInt(thirdInput[2]);

        // Same as above. Not the correct solution.
        int secondIteration = (int) (a + (Math.pow(b, 0) * b));
        solution[11] = secondIteration;

        // Here I was getting incorrect values. There are souts here to examine what values I'm getting. More work needs to be done.
        for(int i = 0; i < n; i++) {
            int test = (int) Math.pow(b, i) * b;
            System.out.println("second iteration --->" + secondIteration);
            System.out.println("test --->" + test);
            System.out.println("iterator --->" + i);
            solution[i + 10] = secondIteration += (Math.pow(b, i) * b);
            System.out.println("solution --->" + solution[i]);
        }

        // Finally, we will iterate through the entire solution array to sout out our correct and final solution:
        for(int number : solution) {
            System.out.println(number);
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
