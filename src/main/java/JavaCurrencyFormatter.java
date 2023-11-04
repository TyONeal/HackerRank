import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
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

            // For India, since the default Locale does not exist, we first build it, then use it in our getCurrencyInstance method:
            Locale IND = new Locale.Builder().setLanguage("id").setRegion("IN").build();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(IND);

            // Next, we format our currency with correct symbols:
            Currency indianRupee = Currency.getInstance("INR");
            currencyFormat.setCurrency(indianRupee);
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setGroupingSeparator(',');
            symbols.setCurrencySymbol("Rs.");
            symbols.setDecimalSeparator('.');
            DecimalFormat decimalIndia = ((DecimalFormat) currencyFormat);
            decimalIndia.setDecimalFormatSymbols(symbols);
            String formattedIndia = decimalIndia.format(payment);
            System.out.printf("India: %s%n", formattedIndia);
            System.out.printf("China: %s%n", NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
            System.out.printf("France: %s%n", NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        }
    }
}

// HackerRank Problem Description

//    Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
//
//        US: formattedPayment
//        India: formattedPayment
//        China: formattedPayment
//        France: formattedPayment
//        where  is  formatted according to the appropriate Locale's currency.
//
//        Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
//
//        Input Format
//
//        A single double-precision number denoting .
//
//        Constraints
//
//        Output Format
//
//        On the first line, print US: u where  is  formatted for US currency.
//        On the second line, print India: i where  is  formatted for Indian currency.
//        On the third line, print China: c where  is  formatted for Chinese currency.
//        On the fourth line, print France: f, where  is  formatted for French currency.
//
//        Sample Input
//
//        12324.134
//        Sample Output
//
//        US: $12,324.13
//        India: Rs.12,324.13
//        China: ￥12,324.13
//        France: 12 324,13 €
//        Explanation
//
//        Each line contains the value of  formatted according to the four countries' respective currencies.
