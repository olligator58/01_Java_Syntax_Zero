import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
����������� ������
*/

public class Task1664 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Paths.get(scanner.nextLine());
        Path targetDirectory = Paths.get(scanner.nextLine());
        try ( DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path: files) {
                Path targetFile = targetDirectory.resolve(path.getFileName());
                if (Files.isRegularFile(path)) {
                    Files.move(path, targetFile);
                }
            }

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

