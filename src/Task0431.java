import java.util.Scanner;

/* 
��� ����� �����
*/

public class Task0431 {
    public static void main(String[] args) {
        String text = " ����� ����.";
        //�������� ��� ��� ���
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        int i = 0;
        
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
        keyboard.close();
    }
}
