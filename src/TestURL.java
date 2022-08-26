import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://javarush.ru");
            InputStream input = url.openStream();
            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
