import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
��� ����, ���� � ������ ���� ������� null
*/

public class Task1962 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "���� ������� ����� null";
        list.stream().forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }
}
