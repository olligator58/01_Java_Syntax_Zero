import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Файл или директория
*/

public class Task1660 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean correctPath = true;
        while (correctPath) {
            Path path = Paths.get(keyboard.nextLine());
            if (Files.exists(path)) {
                System.out.print(path);
                if (Files.isRegularFile(path)) {
                    System.out.print(THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.print(THIS_IS_DIR);
                }
                System.out.println();
            } else {
                correctPath = false;
            }
        }
        keyboard.close();
    }
}

