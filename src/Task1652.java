import java.nio.file.Path;
import java.util.Scanner;

/*
���������� ����
*/

public class Task1652 {
    public static void main(String[] args) {
        //���� ��� ����� �������� ������� � 11-� ������ Java
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if (!path.isAbsolute()) {
            path = path.toAbsolutePath();
        }
        System.out.println(path);
    }
}

