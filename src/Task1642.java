import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Task1642 {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        char[] chars = result.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            stream.print(chars[i]);
        }
        System.out.println(outputStream.toString());
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}