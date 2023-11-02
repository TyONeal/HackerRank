import com.sun.net.httpserver.Authenticator;

import javax.xml.transform.Result;
import java.io.*;
import javax.xml.transform.*;
import java.util.Calendar;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // We're given our parameters to complete this problem, so all we need to do is create a local date based on our arguments first:
        LocalDate date = LocalDate.of(year, month, day);

        // Then we provide our output with a handy built-in method:
        return date.getDayOfWeek().toString();
    }

    // Had to refactor code here in Intellij to show correct solution. HackerRank problem shows 'Result' as our class name, so that had to be changed:
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


// HackerRank Problem Description

//    The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
//
//        You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
//
//        Example
//
//
//
//        The method should return  as the day on that date.
//
//        image
//        Function Description
//
//        Complete the findDay function in the editor below.
//
//        findDay has the following parameters:
//
//        int: month
//        int: day
//        int: year
//        Returns
//
//        string: the day of the week in capital letters
//        Input Format
//
//        A single line of input containing the space separated month, day and year, respectively, in    format.
//
//        Constraints
//
//        Sample Input
//
//        08 05 2015
//        Sample Output
//
//        WEDNESDAY
//        Explanation
//
//        The day on August th  was WEDNESDAY.