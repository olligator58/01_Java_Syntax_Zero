import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
� ��� �� ������ �����?
*/

public class Task1662 {

    private static final String THIS_IS_FILE = " - ��� ����";
    private static final String THIS_IS_DIR = " - ��� ����������";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Paths.get(scanner.nextLine());
        DirectoryStream<Path> files = Files.newDirectoryStream(directory);
        for (Path file: files) {
            if (Files.isRegularFile(file)) {
                System.out.println(file + THIS_IS_FILE);
            } else if (Files.isDirectory(file)) {
                System.out.println(file + THIS_IS_DIR);
            }
        }
    }
}

