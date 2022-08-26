import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Ïטרול באיעû ג פאיכ
*/

public class Task1640 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            Files.write(Paths.get(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

