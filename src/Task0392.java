import java.util.Scanner;

/* 
��������� ����������
*/

public class Task0392 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.nextLine();
        
        if (password.equalsIgnoreCase(secret)) {
            System.out.println("������ ��������");
        } else {    
            System.out.println("������ ��������");
        }
        keyboard.close();
    }
}
