import java.io.*;
import java.util.Scanner;

public class TestFiles {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in);
             BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(keyboard.nextLine())));
            /* OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(keyboard.nextLine()))*/) {
            char[] buffer = new char[1024];
            while (in.ready()) {
                /*int real = in.read(buffer);
                out.write(buffer, 0, real);*/
                String line = in.readLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
