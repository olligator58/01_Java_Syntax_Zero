import java.util.Scanner;

/* 
������� ������
*/

public class Task0390 {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        String str1 = keyboard.nextLine();
        String str2 = keyboard.nextLine();

        if (str1.equals(str2)) {
            System.out.println("������ ����������");
        } else {    
            System.out.println("������ ������");
        }
        keyboard.close();
    }
}
