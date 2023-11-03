import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        // First, we instantiate a Scanner Object to read our input:
        Scanner scanner = new Scanner(System.in);

        // Now we instantiate a payment variable that takes in our input:
        double payment = scanner.nextDouble();

        // Next, we set our proper parameters based on the problem with a conditional:
        if (payment >= 0 && payment <= Math.pow(10, 9)) {
            // Next, inside the conditional we create our formatted output based on the locale currency of that country:
            System.out.printf("US: %s%n", NumberFormat.getCurrencyInstance(Locale.US).format(payment));

            // For India, the locale created with java 15 will result in the rupee symbol, not the rupee indicator. We have to cheat a bit to get this to work:
            System.out.printf("India: Rs.%.2f%n", payment);
            System.out.printf("China: %s%n", NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
            System.out.printf("France: %s%n", NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        }
    }
}

// Example input: 33.433
