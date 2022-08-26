/*
�������� ���������
*/
public class Task1021 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("���������� ����� " + decimalNumber + " ����� ��������� ����� " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("�������� ����� " + binaryNumber + " ����� ����������� ����� " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = "";
        if (decimalNumber <= 0) {
            return binary;
        }
        while (decimalNumber != 0) {
            binary = (decimalNumber % 2) + binary;
            decimalNumber = decimalNumber /2 ;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber == null || binaryNumber.equals("")) {
            return decimal;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            int j = binaryNumber.length() - 1 - i;
            int digit = binaryNumber.charAt(j) - '0';
            decimal = (int)(decimal + (digit * Math.pow(2, i)));
        }
        return decimal;
    }
}
