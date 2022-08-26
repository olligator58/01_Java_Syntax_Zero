import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
ֿטרול סטלגמכû ג פאיכ
*/

public class Task1641 {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(scanner.nextLine()))) {
            writer.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


