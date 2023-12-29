import java.io.FileWriter;
import java.io.IOException;

public class EX06 {
    public static void main(String[] args) {
        char[] hi = {'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        try {
            FileWriter fw = new FileWriter("hello.txt");
            fw.write(hi);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}