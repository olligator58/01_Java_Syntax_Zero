package Task1510;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
��������� ������������
*/

public class Solution {

    public static final String INPUT_NAME = "\n������� ���: ";
    public static final String INPUT_AGE = "������� ������� ������������ '%s': ";

    public static final String CANNOT_BE_NULL = "��� �� ����� ���� null.";
    public static final String CANNOT_BE_EMPTY = "��� �� ����� ���� ������.";
    public static final String CANNOT_CONTAIN_DIGIT = "��� �� ����� ��������� �����.";
    public static final String CANNOT_BE_NEGATIVE = "������� �� ����� ���� ������ 0.";
    public static final String CANNOT_BE_TOO_BIG = "������� �� ����� ���� ������ 150.";
    public static final String UNKNOWN_ERROR = "����������� ������.";

    public static final String FOUND = "\n������������ '%s' ������ ��� �������� %d.\n";
    public static final String NOT_FOUND = "\n������������ '%s' �� ������.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("�������");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());
        //������������ ��������� ���
        switch (user.setName(name)) {
            case 0:
                break;
            case -1:
                System.out.println(CANNOT_BE_NULL);
                break;
            case -2:
                System.out.println(CANNOT_BE_EMPTY);
                break;
            case -3:
                System.out.println(CANNOT_CONTAIN_DIGIT);
                break;
            default:
                System.out.println(UNKNOWN_ERROR);
        }
        //������������ ��������� �������
        switch (user.setAge(age)) {
            case 0:
                break;
            case -1:
                System.out.println(CANNOT_BE_NEGATIVE);
                break;
            case -2:
                System.out.println(CANNOT_BE_TOO_BIG);
                break;
            default:
                System.out.println(UNKNOWN_ERROR);
        }

        users.add(user);
    }

    static void findUserIndex(User user) {
        if (users.indexOf(user) == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }
}
