/*
����� � ������
*/

public class Task1051 {
    public static void main(String[] args) {
        String string = "����� ����� �������������, ����� ������ ���. ����� ������ ���, ����� �������. ����� �������, ����� �������.";
        String word = "���";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("������ ������� ������� ������� ����� \"" + word + "\" ����� - " + indexFromFirstWord);
        System.out.println("������ ������� ������� ���������� ����� \"" + word + "\" ����� - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        return string.lastIndexOf(word);
    }
}
