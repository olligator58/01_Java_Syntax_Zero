import java.util.stream.Stream;

/*
�������������� ������-2
*/

public class Task1950 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("��", "����������", "����", "���-��", "��", "��������.", "����", "��", "��", "��������", "���", "��", "�������.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(String::toUpperCase);
    }
}
