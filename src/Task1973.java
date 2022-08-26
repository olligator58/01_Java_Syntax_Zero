import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/*
»з потока данных Ч в строку
*/

public class Task1973 {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        return stringStream.collect(joining(" "));
    }
}
