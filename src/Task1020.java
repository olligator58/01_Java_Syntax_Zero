/*
������������ ���������
*/

public class Task1020 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("���������� ����� " + decimalNumber + " ����� ������������� ����� " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("������������ ����� " + octalNumber + " ����� ����������� ����� " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }
        int i = 0;
        int result = 0;
        while (decimalNumber != 0) {
            result += (decimalNumber % 8) * Math.pow(10, i);
            decimalNumber /= 8;
            i++;
        }
        return result;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }
        int i = 0;
        int result = 0;
        while (octalNumber != 0) {
            result += (octalNumber % 10) * Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return result;
    }
}
