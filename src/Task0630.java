import java.util.Scanner;

/* 
Reverse
*/

public class Task0630 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        int[] Array;
        int n = keyboard.nextInt();
        if (n > 0) {
            Array = new int[n];
            //���� �������
            for (int i = 0; i < n; i++) {
                Array[i] = keyboard.nextInt();
            }
            if (n % 2 == 0) { //N-������, ������� ����� � �������� �������
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(Array[i]);
                }
            } else { //N-��������, ������� ����� � ������� �����
                for (int i = 0; i < n; i++) {
                    System.out.println(Array[i]);
                }
            }
        }
        keyboard.close();
    }
}