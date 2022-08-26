import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileCopy {
    public static void main(String[] args) {
        String src = "C:\\work\\JavaRush\\files\\121i.xml";
        String dest = "C:\\work\\JavaRush\\files\\121icopy.xml";

        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = new byte[65536]; // 64Kb
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (Exception e) {
        }
    }
}
