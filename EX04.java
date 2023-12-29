import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX04 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("donkey.txt");
            BufferedReader br = new BufferedReader(fr);

            String l;
            int count = 0;

            while ((l = br.readLine()) != null) {
                System.out.println(l);
                count += l.length(); 
            }

            br.close();

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }
}