import java.nio.file.Path;
import java.util.Scanner;

/*
¬се относительно
*/

public class Task1651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //Ётот код будет компилироватьс€ тольно начина€ с 11-й версии Java
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

