import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX03 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input an integer n: ");
            int n = Integer.parseInt(br.readLine()); 
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println(sum);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}