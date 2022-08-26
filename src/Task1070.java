/*
���������� �� StringBuilder
*/

public class Task1070 {
    public static void main(String[] args) {
        String string = "�������, ������� � ��� ��� �������! ";

        System.out.println(addTo(string, new String[]{"��� ", "������� ", "������ ", "���� ", "�� ", "�����"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder builder = new StringBuilder(string);
        return builder.replace(start, end, str);
    }
}
