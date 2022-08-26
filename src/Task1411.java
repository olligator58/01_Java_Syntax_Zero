import java.util.HashSet;

import static java.util.Arrays.asList;

/*
�������� �����������
*/

public class Task1411 {
    public static HashSet<String> words = new HashSet<>(asList("���� �� ���� ��������� ������� ���� �� ������ Java � �� �� �������".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println(String.format("����� %s ���� � ���������", word));
        } else {
            System.out.println(String.format("����� %s ��� � ���������", word));
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
