import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
��� ��������
*/

public class Task1942 {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "�����", "�����", "�������������", "�����", "���������������",
                "�", "�����", "���������������", "�����", "�������");

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        return words.stream()
                .distinct();
    }
}
