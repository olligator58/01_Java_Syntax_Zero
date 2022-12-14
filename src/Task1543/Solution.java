package Task1543;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
?????????? ??????????
*/

public class Solution {

    public static final String FAILED_TO_READ = "?? ??????? ???????? ????.";
    public static final String FAILED_TO_WRITE = "?? ??????? ???????? ? ????.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (Exception e) {
            Throwable exception = e.getCause();
            if (exception instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (exception instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}
