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
