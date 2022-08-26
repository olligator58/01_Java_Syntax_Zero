import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
��������� ������ Stream
*/

public class Task1930 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "����", "�����", "����", "�����");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        return Arrays.stream(array);
    }
}
