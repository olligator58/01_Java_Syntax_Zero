/*
�������-����������������� ���������
*/

public class Task1023 {
    public static final String[] BINS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("�������� ����� " + binaryNumber + " ����� ������������������ ����� " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("����������������� ����� " + hexNumber + " ����� ��������� ����� " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNum = "";
        // ��������, ��� ������ �� null � ��������
        if (binaryNumber == null || binaryNumber.equals("")) {
            return hexNum;
        }
        // ��������, ��� ������ �������� ������ 1 � 0
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                return hexNum;
            }
        }
        //��������� ������ ������, ����� ��� ���� ������� 4
        if (binaryNumber.length() % 4 != 0) {
            int nullsNumber = 4 - binaryNumber.length() % 4;
            for (int i = 0; i < nullsNumber; i++) {
                binaryNumber = '0' + binaryNumber;
            }
        }
        // ����� �� 4 ������� � ������ � ��������� �� � ����������������� �����
        int i = 0, j = 3;
        while (j < binaryNumber.length()) {
            String fourDigits = binaryNumber.substring(i, j + 1);
            //���� ���� 4 ����� � ������� BINS
            int index = 0;
            for (int k = 0; k < BINS.length; k++) {
                if (BINS[k].equals(fourDigits)) {
                    index = k;
                    break;
                }
            }
            hexNum = hexNum + HEX.charAt(index);
            i += 4;
            j += 4;
        }
        return hexNum;
    }

    public static String toBinary(String hexNumber) {
        String binNum = "";
        // ��������, ��� ������ �� null � ��������
        if (hexNumber == null || hexNumber.equals("")) {
            return binNum;
        }
        // ��������, ��� ������ �������� ������ ������� �� HEX
        for (int i = 0; i < hexNumber.length(); i++) {
            if (HEX.indexOf(hexNumber.charAt(i)) < 0) {
                return binNum;
            }
        }
        // ���� ��������������� �������� �������� ������
        for (int i = 0; i < hexNumber.length(); i++) {
            binNum = binNum + BINS[HEX.indexOf(hexNumber.charAt(i))];
        }
        return binNum;
    }
}
