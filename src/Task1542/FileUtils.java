package Task1542;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("������ ���������� ����� " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("���������� ������ � ���� " + filePath);
    }
}
