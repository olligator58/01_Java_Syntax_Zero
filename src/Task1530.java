import java.util.Scanner;

/*
���� �����
*/

class Task1530 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("���� �����");
        } else if (answer.toLowerCase().equals("��")) {
            System.out.println("���-�� ����� :) ������ ����� ���������:");
            throw new SecurityException();
        } else {
            System.out.println("��� ������� \"" + answer + "\", � �� ���� �����");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}
