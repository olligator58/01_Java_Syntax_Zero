import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Task1060 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer token = new StringTokenizer(query, delimiter);
        String[] result = new String[token.countTokens()];
        int i = 0;
        while (token.hasMoreTokens()) {
            result[i] = token.nextToken();
            i++;
        }
        return result;
    }
}
