import java.util.Scanner;

/* 
�������� �����
*/

public class Task04100 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        int speed = keyboard.nextInt();
        System.out.println((int)Math.round(speed * 3.6));
        keyboard.close();
    }
}