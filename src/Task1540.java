/*
������������ ����������
*/

public class Task1540 {

    public static String errorMessage = "�� �������";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("���� ���������� �����: " + luckyNumber);
    }
}
