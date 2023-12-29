import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX02 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = ""; 

        try {
            System.out.print("Input a string: ");
            str = br.readLine(); 
        } catch (IOException e) {
            e.printStackTrace();
        }

        String upstr = str.toUpperCase();
        System.out.println("Uppercase string = " + upstr);
    }
}