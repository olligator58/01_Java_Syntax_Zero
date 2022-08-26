import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
    public static void main(String[] args) {
        String path = "C:\\work\\JavaRush\\files\\myfile.txt";
        try (FileOutputStream output = new FileOutputStream(path)) {
            output.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*FileOutputStream output = null;
        try {
            output = new FileOutputStream(path);
            output.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (output != null)
                    output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
