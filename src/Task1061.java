/*
String.format()
*/

public class Task1061 {
    public static void main(String[] args) {
        System.out.println(format("�����", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("���� ����� %s. � ���� ������������ $%d � �����.", name, salary);
        return phrase;
    }
}
