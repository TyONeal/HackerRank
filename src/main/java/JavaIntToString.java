import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        // First, we declare our Scanner Object to read our inputs:
        Scanner scanner = new Scanner(System.in);

        // Now, we do our inclusion for the variable of 'n' after declaring it:
        int n = scanner.nextInt();

        // Here, we'll set up our parameters, according to the problem:
        if (n >= -100 && n <= 100) {

            // Here, we'll use a String method of value of to attempt to parse it. Then, we'll chain the isEmpty() method after it, in order to change it to a Boolean. If it is not empty, we know that it was successfully parsed. We use our conditional to set up our correct output:
            if(!String.valueOf(n).isEmpty()) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }
    }
}

// HackerRank Problem Description

//    You are given an integer , you have to convert it into a string.
//
//        Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//
//        can range between  to  inclusive.
//
//        Sample Input 0
//
//        100
//        Sample Output 0
//
//        Good job