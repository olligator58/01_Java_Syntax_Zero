import java.util.Scanner;

/* 
������ ����������� ����� �� ���������
*/

public class Task0452 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE; 
        while(keyboard.hasNextInt()) {
            int a = keyboard.nextInt();
            if (a < min) {
                secondmin = min;
                min = a;
            } else if (a > min && a < secondmin) {
                secondmin = a;
            }
        }
        System.out.println(secondmin);
        keyboard.close();
    }
}