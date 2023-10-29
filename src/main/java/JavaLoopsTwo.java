import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        int[] solution = new int[15];
        String firstLine = buffReader.readLine().trim();
        String secondLine = buffReader.readLine().trim();
        String thirdLine = buffReader.readLine().trim();
        int initial = Integer.parseInt(firstLine);
        String[] secondInput = secondLine.split(" ");
        String[] thirdInput = thirdLine.split(" ");
        int a = Integer.parseInt(secondInput[0]);
        int b = Integer.parseInt(secondInput[1]);
        int n = Integer.parseInt(secondInput[2]);
        int firstIteration = a + b;
        solution[0] = firstIteration;
        for(int i = 0; i < n; i++) {
            solution[i + 1] += (Math.pow(b, i) * b);
        }
        a = Integer.parseInt(thirdInput[0]);
        b = Integer.parseInt(thirdInput[1]);
        n = Integer.parseInt(thirdInput[2]);
        int secondIteration = a;
        for(int i = 0; i < n; i++) {
            int test = (int) Math.pow(b, i) * b;
            System.out.println("second iteration --->" + secondIteration);
            System.out.println("test --->" + test);
            System.out.println("iterator --->" + i);
            solution[i + 10] = secondIteration += (Math.pow(b, i) * b);
            System.out.println("solution --->" + solution[i]);
        }
        for(int number : solution) {
            System.out.println(number);
        }

    }
}
