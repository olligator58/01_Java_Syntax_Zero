import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
????????? ?????????? ?????
*/

public class Task1670 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try (InputStream input = new URL(line).openStream()) {
            byte[] buffer = input.readAllBytes();
            Path dest = Files.createTempFile(null, null);
            Files.write(dest, buffer);
            System.out.println(dest);
        }
    }
}