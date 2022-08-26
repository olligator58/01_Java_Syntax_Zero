/*
������ �����
*/

public class Task1321 {
    public static void main(String[] args) {
        String string = "�����, ��� ����� ����� �����." +
                "������ �� �������� ������, ��� ��� �������� ��������.";

        System.out.println("���������� ���� � ������ : " + countDigits(string));
        System.out.println("���������� ���� � ������ : " + countLetters(string));
        System.out.println("���������� �������� � ������ : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLetters(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countSpaces(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}
