import java.util.*;

/*
��������� �������� � ���� for-each
*/

public class Task1421 {

    public static void printList(ArrayList<String> words) {
        for (String word: words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String word: words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "�����, ��� ����� ����� �����. ������ �� �������� ������, ��� ��� �������� ��������.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
