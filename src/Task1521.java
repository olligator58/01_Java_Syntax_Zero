import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
�������� �������������-2
*/

public class Task1521 {

    public static final String PROMPT_STRING = "������� ����� ��������, ��� exit ��� ������: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "�������� ";
    public static final String NOT_EXIST = "�������� � ����� ������� �� ����������";
    public static final String INTEGER_REQUIRED = "����� ������ ����� �����";

    static List<String> studentsJournal = Arrays.asList(
            "����� ������"
            , "�������� �������"
            , "����� ������"
            , "����� �����������"
            , "������ �������"
            , "������� ����������"
            , "������ �������"
            , "������� ���������"
            , "����� ���������"
            , "������� ���������");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId;
            try {
                studentId = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
                continue;
            }

            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
