import java.nio.file.Path;
import java.util.Scanner;

/*
��� � ������
*/

public class Task1650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        ���� ��� ����� �������� ������ ������� � 11-� ������ java
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}

