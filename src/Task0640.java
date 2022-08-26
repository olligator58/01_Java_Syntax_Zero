import java.util.Scanner;

/*
������� ���������� ������
*/

public class Task0640 {
    public static String[] strings;
    public static final int LINES_NUMBER = 6;

    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        strings = new String[LINES_NUMBER];
        //���� �������
        for (int i = 0; i < strings.length; i++) {
            strings[i] = keyboard.nextLine();
        }
        //������� ������������� ������
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                //String line = strings[i];
                boolean found = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[j].equals(strings[i])) { // � ������� ������� ���� ������������� ������ � �������� ��
                        strings[j] = null;
                        found = true; // ����� ������������� ������
                    }
                }
                if (found) {
                    strings[i] = null; // ���� � ������� ������� ����� ������������� ������, �� �������� ������� ������� �������
                }
            }
        }
        //����� �������
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        keyboard.close();
    }
}
