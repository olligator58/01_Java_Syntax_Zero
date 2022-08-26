import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* 
Получение информации по API
*/

public class Task1671 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            String lines = new String(buffer);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}