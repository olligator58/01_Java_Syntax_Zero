import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/*
Получение информации по API
*/

public class Task1672 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connect = url.openConnection();
        connect.setDoOutput(true);
        try (OutputStream output = connect.getOutputStream();
             InputStream input = connect.getInputStream();
             PrintStream print = new PrintStream(output);
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            print.println("Hello, httpbin.org/post.");
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

