/*
�������� ������
*/

public class Task1071 {
    public static void main(String[] args) {
        String string = "����� ��� ����� �������";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
}
