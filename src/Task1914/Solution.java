package Task1914;

import java.util.ArrayList;
import java.util.Collections;

/*
�������� � ������-����������
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}
